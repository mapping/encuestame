/*
 ************************************************************************************
 * Copyright (C) 2001-2009 encuestame: system online surveys Copyright (C) 2009
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */
package org.encuestame.core.test.persistence.domain;

import org.encuestame.core.persistence.domain.CatLocationType;
import org.encuestame.core.test.service.config.AbstractBase;
import org.junit.Test;

/**
 * Test Catalog Location Type.
 * @author Morales Urbina, Diana paola@encuestame.org
 * @since 06/11/2009 12:18:49
 * @version $Id$
 */

public class TestLocationType extends AbstractBase {

    /**
     * Test Location Type.
     */
    @Test
    public void testLocationType(){
        final CatLocationType catLocType = new CatLocationType();
        catLocType.setLocationTypeDescription("Description");
        catLocType.setLocationTypeLevel(1);
        catLocType.setLocationTypeId(1L);
        //getCatLocationType().saveOrUpdate(catLocType);
    }

}