package tugas_03celcius;

public class tugas_03celcius {
   double toFahrenheit(){
   //°F = °C × 1,8 + 32
   return (tugas_03celcius.SuhuAwal*1.8+32);
   }
   double toReamur(){
   //°Ré = °C × 0,8
   return (tugas_03celcius.SuhuAwal*0.8);
   }
   double toKelvin(){
   //K = °C + 273,15
   return (tugas_03celcius.SuhuAwal+273.15);
   }
}