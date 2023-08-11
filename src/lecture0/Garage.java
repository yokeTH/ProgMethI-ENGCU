package lecture0;
public class Garage {
    Car[] cars;
    public void removeDup(){
        for(int i = 0; i< cars.length; i++){
            if(cars[i] == null) continue;
            for(int j = i+1; j< cars.length; j++){
                if(cars[j] != null && cars[i].equals(cars[j])){
                    cars[j] = null;
                }
            }
        }
        int cnt = 0;
        for(Car car: cars){
            if(car != null){
                cnt+=1;
            }
        }

        Car[] temp = new Car[cnt];
        cnt = 0;
        for(Car car: cars){
            if(car != null){
                temp[cnt++] = car;
            }
        }

        cars = temp;
    }
}
