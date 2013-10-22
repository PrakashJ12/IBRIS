/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prakash.com;

import net.sf.json.JSONObject;

/**
 *
 * @author Prakash
 */
public class JsonHandler {
        public JSONObject getJsonRequest(javax.servlet.http.HttpServletRequest request){
            String data=request.getParameter("data");
            JSONObject requestJson = JSONObject.fromObject(data.trim());
            return requestJson;
        }
    
}
