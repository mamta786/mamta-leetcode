// 1436. Destination City
class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> cities = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            List<String> path = paths.get(i);

            for (String city : path) {
                cities.add(city);

            }

        }

        for (String destcity : cities) {
            Boolean isDest = true;

            for (int i = 0; i < paths.size(); i++) {

                if (destcity.equals(paths.get(i).get(0))) {
                    isDest = false;
                    break;
                }
            }
            if (isDest == true) {
                return destcity;

            }

        }

        return null;

    }
}
//2nd Suolution:

class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> cities = new HashSet<>();

        for (List<String> path : paths) {
            cities.add(path.get(0));
            cities.add(path.get(1));
        }

        for (String destcity : cities) {
            Boolean isDest = true;

            for (int i = 0; i < paths.size(); i++) {

                if (destcity.equals(paths.get(i).get(0))) {
                    isDest = false;
                    break;
                }
            }
            if (isDest == true) {
                return destcity;

            }

        }

        return null;

    }
}


// 3rd Solution
class Solution {
    public String destCity(List<List<String>> paths) {

    Set<String> seenCities = new HashSet();

     for(int i =0;i<paths.size();i++){
        String currentCity = paths.get(i).get(1);

        if (seenCities.contains(currentCity))
            continue;

        seenCities.add(currentCity);
        Boolean isDest = true;

        for(int j =0;j<paths.size();j++){
            
            if(currentCity.equals(String.valueOf(paths.get(j).get(0)))){
             isDest = false;
             break;

            }
        
        }

        if (isDest == true) {

                return currentCity;

        }


     }
return null;
    }
}
