public class Person {
    String nameSurname;
    int salary;
    int workhours;
    int hireyear;

    Person(String nameSurname,int salary,int workhours,int hireyear){
        this.nameSurname=nameSurname;
        this.salary=salary;
        this.workhours=workhours;
        this.hireyear=hireyear;

    }
    double tax(){
        if (this.salary>=1000){
            return this.salary*0.03;
        }
        return 0;
    }
    double bonus() {
        if (this.workhours > 40) {
            return (this.workhours - 40) * 30;
        } else {
            return 0;
        }
    }
    double reisesalary() {
        if ((this.hireyear - 2021) > 10) {
            return this.salary * 0.05;
        } else if ((2021-this.hireyear)> 9 && (2021 - this.hireyear < 20)) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
        void printinfo(){
            System.out.println("Çalışanın ismi :"+ this.nameSurname);
            System.out.println("Çalışanın maaşı :"+ this.salary);
            System.out.println("Çalışma saati :"+ this.workhours);
            System.out.println("İşe başlama yılı :" + this.hireyear);
            System.out.println("Vergi tutarı :"+ tax());
            System.out.println("Bonuc tutarı :"+ bonus());
            System.out.println("Maaş zam tutarı :"+ reisesalary());
            System.out.println("Vergi ve bonuslar ile birlikte maaş tutarı :"+ (this.salary-tax()+bonus()));
            System.out.println("Toplam maaş : " + (this.salary-tax()+bonus()+reisesalary()));

        }
    }


