package us.tfg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import us.tfg.rest.domain.Cobertura;

@Controller
public class DatosController {
	
    private static final String TEMPLATE_VIEW = "mapa";

	
	private RestTemplate restTemplate;
	
	public DatosController() {
		restTemplate = new RestTemplate();
	}
	
	@RequestMapping("/mapa")
	public String mapaCoberturaAll(ModelMap model) {
		String url = "https://tfg-rest.herokuapp.com/findAll";
        ResponseEntity<Cobertura[]> response = restTemplate.getForEntity(url, Cobertura[].class);		
        Cobertura[] coberturas =response.getBody();
		String[][] datos = new String[coberturas.length+1][3];
		List<String> data = new ArrayList<String>();  

        for (int i=0; i<coberturas.length;i++) {
        	//X
        	datos[i][0]=coberturas[i].getCoordenadas().split(",")[0];
        	//Y
        	datos[i][1]=coberturas[i].getCoordenadas().split(",")[1];
        	//weight
        	datos[i][2]=convertirCobertura(Integer.parseInt(coberturas[i].getDbm()),coberturas[i].getTipoFrecuencia());
        	data.add(coberturas[i].getCoordenadas().split(",")[0]+"@"+coberturas[i].getCoordenadas().split(",")[1]+"@"+convertirCobertura(Integer.parseInt(coberturas[i].getDbm()),coberturas[i].getTipoFrecuencia()));

        }
        
        model.addAttribute("datos", datos);
        model.addAttribute("data", data);
        return TEMPLATE_VIEW;
	}
	
	private String convertirCobertura(Integer dbm,String signal){
        if ("SIGNAL_4G".equals(signal)){
            if (dbm != null) {
                if (dbm>=-90){
                    return "3";
                }else if (dbm<=-91 && dbm >= -105){
                    return "6";
                }else if(dbm <= -106 && dbm >= -110){
                    return "7";
                }else if(dbm <=-111 && dbm > -115){
                    return "20";
                }else if(dbm <=-116 && dbm >-120){
                    return "30";
                }else if(dbm <= -120){
                    return "40";
                }else{
                    return "40";
                }
            }else{
                 return "40";
            }
        }else if("SIGNAL_3G".equals(signal) || "SIGNAL_2G".equals(signal)){
            if (dbm != null) {
                if (dbm>=-70){
                    return "1";
                }else if (dbm<=-71 && dbm >= -85){
                    return  "3";
                }else if(dbm <= -86 && dbm >= -100){
                    return "5";
                }else if(dbm <=-101 && dbm > -105){
                    return"7";
                }else if(dbm <=-106 && dbm >-110){
                    return "15";
                }else if(dbm <= -110){
                    return "15";
                }else{
                    return "15";
                }
            }else{
                return "15";
            }
        }else{return "15";}
    }


	}