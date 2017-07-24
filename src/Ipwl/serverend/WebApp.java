package Ipwl.serverend;

import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class WebApp {
	private static ServletContext contxt;
	static{
		try {
			//��ȡ��������
			SAXParserFactory factory = SAXParserFactory.newInstance();
			//��ȡ������
			SAXParser sax = factory.newSAXParser();
			//ָ��xml+������
			WebHandler web = new WebHandler();
			sax.parse(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("WEB_INFO/web.xml"), web);
			
			
			//��list ת��Map
			contxt =new ServletContext();			
			Map<String,String> servlet =contxt.getServlet();
			
			//servlet-name  servlet-class 
			for(Entity entity:web.getEntityList()){
				servlet.put(entity.getName(), entity.getClz());
				
			}
			
			//url-pattern servlet-name			
			Map<String,String> mapping =contxt.getMapping();
			for(Mapping mapp:web.getMappingList()){
				List<String> urls =mapp.getUrlPattern();
				for(String url:urls ){
					mapping.put(url, mapp.getName());
				}
			}
			
		} catch (Exception e) {
			
		}
		
		
	}
	
	public static Servlet getServlet(String url) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if((null==url)||(url=url.trim()).equals("")){
			return null;
		}
		//�����ַ���(����·��)��������
		
		//return contxt.getServlet().get(contxt.getMapping().get(url));
		String name=contxt.getServlet().get(contxt.getMapping().get(url));
		return (Servlet)Class.forName(name).newInstance();//ȷ���չ������
	}
}
