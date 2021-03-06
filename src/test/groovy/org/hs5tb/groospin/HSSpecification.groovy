/*
*
*
* @author Alberto Vilches (alberto.vilches@)
* @date 13/6/16
* Copyright. All Rights Reserved.
*/
package org.hs5tb.groospin

import org.hs5tb.groospin.base.HyperSpin
import spock.lang.Specification;

abstract class HSSpecification extends Specification {

    String rootTestResources = "src/test/resources"

    HyperSpin createDefaultHS() {
         new HyperSpin(rootTestResources+"/HyperSpin", rootTestResources+"/RocketLauncher")
     }

    File createResource(String path) {
        if (path.startsWith("/")) return new File(path)
        else new File(rootTestResources, path).canonicalFile
    }

}