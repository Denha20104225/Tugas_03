package tugas_03kelvin;

public class tugas_03kelvin {
  double toFahrenheit(){
  //°F = K × 1,8 − 459,67
  return (tugas_03kelvin.SuhuAwal*1.8-459.67);
  }
  double toReamur(){
  //°Ré = (K − 273,15) × 0,8
  return ((tugas_03kelvin.SuhuAwal-273.15)*0.8);
  }
  double toCelcius(){
  //°C = K − 273,15
  return (tugas_03kelvin.SuhuAwal-273.15);
  }
}