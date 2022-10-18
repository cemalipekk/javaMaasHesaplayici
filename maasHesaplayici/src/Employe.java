public class Employe {
    //Sınıfımızın niteliklerini oluşturuyoruz
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Kurucu metodumuz ve 4 parametresi
    Employe(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /* tax() metodu maaşa uygulanan vergiyi hesaplar eğer maaşı 1000 TL den fazla ise
    %3 vergi uygular değilse uygulama */
    double tax() {
        if (this.salary > 1000) {
            return (this.salary * 0.03);
        } else {
            return 0;
        }
    }

    /* bonus() metodu eğer çalışan 40 saatten fazla çalışmış ise saat başına 30 TL
    bonus ücret koyar. */
    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    /* raiseSalary() metodu ise Çalışanın başlangıç yılına göre maaş artışını hesaplar. Eğer 10 yıldan az süredir çalışıyor ise %5
    9 yıldan ve 20 yıldan az çalışıyorsa %10, 19 yıldan fazla çalışıyorsa %15 zam yapılır*/
    double raiseSalary() {
        int year = 2021;
        int workYear = year - this.hireYear;
        if (workYear <= 10) {
            return (this.salary * 0.05);
        } else if (workYear < 20) {
            return this.salary * 0.10;

        } else {
            return this.salary * 0.15;

        }
    }

    /*toString metodunu ise çalışana ait bilgileri ekrana yazdırmak için kullandım  */
    void toString(Employe employe) {

        double netSalary = this.salary + this.bonus() + this.raiseSalary() - this.tax();

        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maas Artisi : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (netSalary - this.raiseSalary()));
        System.out.println("Toplam Maas : " + netSalary);
    }

}


