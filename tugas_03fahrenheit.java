package tugas_03fahrenheit;

public class tugas_03fahrenheit {
  double toReamur(){
  //°Ré = (°F − 32) / 2,25
  return ((tugas_03fahrenheit.SuhuAwal-32)/2.25);
  }
  double toKelvin(){
  //K = (°F + 459,67) / 1,8
  return ((tugas_03fahrenheit.SuhuAwal+459.67)/ 1.8);
  }
  double toCelcius(){
  //°C = (°F − 32) / 1,8
  return ((tugas_03fahrenheit.SuhuAwal-32)/1.8);
  }
}