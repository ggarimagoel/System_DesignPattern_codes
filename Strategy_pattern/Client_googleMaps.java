package Strategy_pattern;

import java.nio.file.Path;

public class Client_googleMaps {
        public void findPath(String to, String from, String mode){

            //        if (mode == ...)
            //            ......
            //        } else if (mode == ....) {
           //            ......
           //        } -> Violates SRP, OCP

            PathCalculator pathCalculator = Path_Factory.getPathCalculator(mode);
            pathCalculator.findPath(from, to);
            }
        }


