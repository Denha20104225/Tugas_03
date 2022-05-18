package tugas_03reamur;

public class tugas_03reamur {
  double toFahrenheit(){
  //°F = °Ré × 2,25 + 32
  return (tugas_03reamur.SuhuAwal*2.25+32);
  }
  double toKelvin(){
  //K = °Ré / 0,8 + 273,15
  return (tugas_03reamur.SuhuAwal/0.8+237.15);
  }
  double toCelcius(){
  //°C = °Ré / 0,8
  return (tugas_03reamur.SuhuAwal/0.8);
  }
}