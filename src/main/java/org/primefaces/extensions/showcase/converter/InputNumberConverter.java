/*
 * Copyright 2012 Mauri.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.primefaces.extensions.showcase.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.primefaces.extensions.showcase.model.Distance;

/**
 * InputNumberConverter converter class.
 *
 * @author  Mauricio Fenoglio / last modified by $Author:$
 * @version $Revision:$
 */
@FacesConverter("inputNumberConverter")
public class InputNumberConverter implements Converter {

	public Object getAsObject(final FacesContext context, final UIComponent component, final String value) {
            Double doubleValue = new Double(0);
            if(value!=null && !value.isEmpty()){
                 doubleValue = Double.valueOf(value);                
            }            
            Distance res = new Distance();
            res.setMeters(doubleValue);
            return res;            
        }

	public String getAsString(final FacesContext context, final UIComponent component, final Object valueO) {
		Distance value = (Distance) valueO;
		Double res = value.getMeters();
		return res.toString();
	}

       
}
