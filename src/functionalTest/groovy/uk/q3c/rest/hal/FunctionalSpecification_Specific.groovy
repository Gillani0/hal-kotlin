/*
 *
 *  *
 *  *  *Copyright (c) 2017.  David Sowerby
 *  *  *
 *  *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  *  * the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  *  * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *  *  * specific language governing permissions and limitations under the License.
 *  *
 *
 */

package uk.q3c.rest.hal

import spock.lang.Specification

/**
 * Functional test against draft specification: http://ionwg.org/draft-ion.html Version Draft-Ionwg-Ion-01
 * *
 *
 * Created by David Sowerby on 22 Feb 2017
 */
class FunctionalSpecification_Specific extends Specification {


    HalMapper mapper
    String href1 = "/users1"

    def setup() {
        mapper = new HalMapper()
    }


}