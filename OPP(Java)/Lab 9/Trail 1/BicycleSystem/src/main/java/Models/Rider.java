package Models;

public class Rider {

    public String Name;
    public String Countty;
    public int Age;
    public float Weight;
    public float Height;

    public class Record {

        public int No_Of_Olympic_Medals;
        public float TopSpeed;
        public int No_National_Level_Records;

        public Record(int medals, float t_Speed, int no_records) {
            this.No_Of_Olympic_Medals = medals;
            this.TopSpeed = t_Speed;
            this.No_National_Level_Records = no_records;
        }

        public String displayRecord(String name, String Country, int Age, float Weight, float Height, int No_Of_Olympic_Medals, float TopSpeed, int No_National_Level_Records) {
            String details = name + " " + Country + " " + Age + " " + Weight;
            return details;
        }

    }

    public double calBMI(float Weight, float Height) {
        class BMI {

            float WeightMetric;
            float HeightMetric;

            public BMI(float WeightMetric, float HeightMetric) {
                this.WeightMetric = WeightMetric;
                this.HeightMetric = HeightMetric;
            }

            double BMIMetric() {
                double bmi = WeightMetric / (HeightMetric * HeightMetric);
                return bmi;
            }

        }
        BMI o = new BMI(Weight, Height);
        return o.BMIMetric();

    }

    public Rider(String Name, String Countty, int Age, float Weight, float Height) {
        this.Name = Name;
        this.Countty = Countty;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;
    }
    
}
