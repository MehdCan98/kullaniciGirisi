import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scannner sınıfını projeye dahil ettik.


public class Main {
    public static void main(String[] args) {

        //String türünde değişkenlerimizi tanımladık.
        String sifre, kullaniciAdi, ySifre, sifreSifirlama;

        Scanner input = new Scanner(System.in);


        //Kullanıcıdan Kullanıcı Adı ve Şifre bilgilerini aldık.
        System.out.print("Lürfen Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Litfen Şifrenizi Giriniz: ");
        sifre = input.nextLine();


        //Kullanıcının girdiği bilgileri bu şekilde tanımlandığı gibi ise giriş gerçekleşiyor
        if (kullaniciAdi.equals("Mehdi")){
            if (sifre.equals("12345")){
                System.out.println("Giriş Başaralı");

                //Şifre yanlış girilirse kullanıcuya şifreyi sıfırlamak isteyip istemediği soruluyor.
            }else {
                // Sıfırlamak isterse A istemezse B'ye basmaksı isteniyor.
                System.out.print("Şifreniz yanlış! Şifrenizi sıfırlamak ister misiniz A / B");
                sifreSifirlama = input.nextLine();


                //A basıp sıfırlamak istemesi halinde önceden String veri tipiyle tanımlanan Ysifre değişkenine yeni şifre girilmesi isteniyor
                if (sifreSifirlama.equals("A")){
                    System.out.print("Yeni Şifrenizi Giriniz");
                    ySifre = input.nextLine();


                    //Girilen yeni şifrenin önceden girilmiş yanlış şifreyle aynı olması halinde uyarı mesajı yazdırılıyor.
                    if (ySifre.equals(sifre)){
                        System.out.print("Yeni Şifreniz hatalı girdiğiniz şifreyle aynı olamaz!");

                        //Girilen yeni Şifrenin eski şifre ile aynı olması durmunda ise yine uyarı mesajı yazdırılıyor.
                    }else{
                        if (ySifre.equals("12345")){
                            System.out.print("Yeni şifren eski şifren ile aynı olmaz!");
                        }

                        //Yeni şifre sorunsuz girildiği taktirde işlemin başarılı olduğu yazdırılıyor.
                        else {
                            System.out.print("Şifreniz başarıyla oluşturulmuştur");
                        }
                    }
                }

                //Kullanıcı şifreyi sıfırlamak istemez ise de bu şekilde bir uyarı yazdırılıyor.
                else {
                    System.out.print("Oturum açılamadı!");
                }
            }
        }

        //Kullanıcı adı yanlış girildiği zaman da bu şekilde " Kullanıcı Adı hatalı" şeklinde bir uyarı mesajı yazdırılıyor.
        else {
            System.out.print("Kullanıcı Adı Hatalı !");
        }

        }
    }