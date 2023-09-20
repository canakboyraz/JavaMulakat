package org.example;

public class CoreJava {
    /*

    1-) JDK ve JRE farkları nelerdir ?

        JDK (Java Development Kit - Java Geliştirme Kiti):
            Açıklama: JDK, Java uygulamaları geliştirmek için kullanılan bir yazılım geliştirme kiti veya ortamıdır.
            İçerik: JDK, Java uygulamalarını yazmak, derlemek, hata ayıklamak ve dağıtmak için gerekli olan tüm araçları ve dosyaları içerir.
            Özellikler: Kod yazma, derleme, hata ayıklama, belge oluşturma gibi geliştirme süreçlerini destekler.
            Boyut: JDK daha büyük bir dosya boyutuna sahiptir ve genellikle geliştiricilere yöneliktir.
        JRE (Java Runtime Environment - Java Çalışma Ortamı):
            Açıklama: JRE, Java uygulamalarını yürütmek (çalıştırmak) için gereken bir çalışma ortamıdır.
            İçerik: JRE, Java uygulamalarını çalıştırmak için gerekli olan Java Sanal Makinesi (JVM) ve Java sınıf kütüphanelerini içerir.
            Özellikler: Sadece Java uygulamalarını çalıştırmak için kullanılır, geliştirme araçları içermez.
            Boyut: JRE, JDK'ye göre daha küçük bir dosya boyutuna sahiptir ve sadece uygulamaları çalıştırmak için gereken bileşenleri içerir.
            Genel olarak, JDK geliştirme için kullanılırken, JRE yalnızca Java uygulamalarını çalıştırmak için kullanılır. Geliştiriciler uygulamalarını oluşturduktan sonra, kullanıcılarının bu uygulamaları çalıştırabilmesi için JRE'yi kullanmaları gerekir.


    2-) Java neden bağımsız bir dil olarak kabul edilir ?

        Java Sanal Makinesi (JVM):
            Java'nın en önemli özelliklerinden biri, kodunun bilgisayarın işletim sistemine doğrudan bağımlı olmamasıdır. Java kaynak kodu, derlendikten sonra Java Sanal Makinesi (JVM) tarafından çalıştırılır. JVM, herhangi bir işletim sistemi için yazılmış ve bu işletim sistemlerine özgüdür. Bu nedenle, bir kez Java uygulamanızı JVM ile derlediğinizde, bu uygulama farklı işletim sistemlerinde çalışabilir.
        Bytecode Dönüşümü:
            Java kaynak kodu, derlendikten sonra platforma bağımsız bir ara dil olan bytecode'a dönüştürülür. Bytecode, JVM tarafından yorumlanır ve çalıştırılır. Bu nedenle, herhangi bir işletim sistemi için bytecode üretildiğinde, bu bytecode, uygun bir JVM ile çalıştırılabilir.
        Standard Library (Java API):
            Java, platform bağımsız olmasını sağlamak için kapsamlı bir standart kütüphane olan Java API'yi içerir. Bu kütüphane, işletim sistemine özgü işlevleri soyutlar ve yerine platform bağımsız işlevler sunar. Bu sayede, geliştiriciler aynı Java kodunu farklı işletim sistemlerinde kullanabilirler.
        Dil Tasarımı:
            Java, dil tasarımı açısından platform bağımsızlığı gözetir. Örneğin, bellek yönetimi gibi işlevler dilin kontrolü altındadır ve geliştiriciye bırakılmaz. Bu, dilin güvenli ve bağımsız olmasını sağlar.

        Tüm bu faktörler bir araya geldiğinde, Java'nın platform bağımsız bir dil olmasını sağlar. Bu özellik, Java'nın farklı işletim sistemlerinde ve cihazlarda geniş bir kullanım alanına sahip olmasına olanak tanır.


     3-)  "final," "finally," ve "finalize" kavramları arasındaki farklar nelerdir ?

        final:
            Açıklama: "final" bir anahtar kelimedir ve Java programlama dilinde değişmezlik anlamına gelir. Bu kelime farklı bağlamlarda kullanılabilir:
            Bir değişkeni "final" olarak tanımlamak, o değişkenin bir kez değer atanabilir ve daha sonra değiştirilemez olduğu anlamına gelir.
            Bir metodu "final" olarak işaretlemek, bu metodun alt sınıflar tarafından ezilemez (override) olduğu anlamına gelir.
            Bir sınıfı "final" olarak işaretlemek, bu sınıfın başka bir sınıf tarafından alt sınıf olarak türetilmesini engeller.
        finally:
            Açıklama: "finally," Java'da bir try-catch bloğunun sonunda kullanılan bir anahtar kelimedir.
            Bu blok, bir istisna (exception) oluşsa bile çalıştırılır. "finally" bloğu, kaynakları (örneğin dosyaları veya veritabanı bağlantılarını) serbest bırakmak veya temizlemek gibi kritik işlemleri gerçekleştirmek için kullanılır. İstisnaların oluşma durumuna bakılmaksızın çalıştırılır.
        finalize:
            Açıklama: "finalize," Java'da bir nesnenin ömrü sona ermeden önce temizlik işlemleri yapmasını sağlayan bir metodun adıdır.
            Ancak bu metodın kullanımı tavsiye edilmez ve modern Java programlamada genellikle kullanılmaz. Çünkü "finalize" metodunun ne zaman çağrılacağı garanti edilemez ve bu, kaynak sızıntılarına neden olabilir. Bu nedenle, temizlik işlemleri için "finally" bloğu veya başka yöntemler tercih edilir.

        Özetlemek gerekirse, "final" değişmezlik (immuability) veya sınıf/nesne yapılarını sınırlandırma amacıyla kullanılırken, "finally" try-catch bloklarının sonunda istisna olsun veya olmasın belirli işlemlerin gerçekleştirilmesi için kullanılır. "finalize" ise eski Java sürümlerinde kullanılan, ancak modern Java'da tavsiye edilmeyen bir nesnenin ömrü sona ermeden önce belirli temizlik işlemlerini yapma amaçlı bir metodun adıdır.


      4-) Stack – Heap farkları nedir ?

        Stack Belleği:
            Yapı ve Kullanım: Stack bellek, özellikle işletim sistemi ve programın çalışma zamanı yönetimi tarafından kullanılır. İşletim sistemi ve dil çalışma zamanı (runtime) sistemleri, işlev çağrıları, yerel değişkenler ve işlem çerçevelerini (call stack) yönetmek için stack belleğini kullanır.
            Hız ve Erişim: Stack belleği hızlı erişim sağlar çünkü bellek bölgeleri sabit boyutludur ve her işlev çağrısında veriler hızlıca eklenir veya çıkarılır. Bu nedenle, stack belleği genellikle hızlıdır.
            Ömür: Stack belleğindeki verilerin ömrü genellikle sınırlıdır ve belirli bir işlev çağrısı veya işlem çerçevesi sona erdiğinde bellek otomatik olarak temizlenir. Bu nedenle, yerel değişkenler ve işlev çağrıları, tanımlı kapsamın dışına çıkıldığında otomatik olarak yok olur.
            Boyut: Stack belleği, sınırlı bir boyuta sahiptir ve genellikle işletim sistemi tarafından belirlenen bir maksimum boyutta olur.
        Heap Belleği:
            Yapı ve Kullanım: Heap bellek, dinamik olarak ayrılmış bellek alanlarını yönetmek için kullanılır. Genellikle, nesnelerin (örneğin, sınıf örnekleri) ve veri yapılarının uzun ömürlü olması gerektiğinde veya çalışma zamanında boyutlarının bilinmediği durumlarda kullanılır.
            Hız ve Erişim: Heap belleği, erişim açısından daha yavaşdır çünkü verilerin yeri dinamik olarak belirlenir ve verilere erişmek için işlem yapma maliyeti daha yüksektir.
            Ömür: Heap belleği, verilerin ömrünü programlama tarafından kontrol etmez. Bellek, elle serbest bırakılana kadar kalır veya gerektiğinde otomatik olarak çöp toplama (garbage collection) ile temizlenir.
            Boyut: Heap belleği, genellikle daha büyük bir boyuta sahiptir ve kullanılabilir bellek miktarı işletim sistemi ve donanım tarafından sınırlanır.

        Özetle, stack belleği yerel değişkenlerin ve işlev çağrılarının yönetimi için kullanılır ve ömrü genellikle sınırlıdır. Heap belleği ise dinamik olarak ayrılmış verilerin yönetimi için kullanılır ve ömürleri programlama tarafından kontrol edilir. İki bellek türü arasındaki seçim, kullanım senaryosuna ve ihtiyaca bağlıdır.


      5-) Metot Overloading ve Metot Overriding farkları nelerdir ?

         Method Overloading:
            Açıklama: Metod Overloading, aynı sınıf içinde aynı adı taşıyan birden fazla metodun tanımlanabilmesine olanak tanır. Ancak bu metotların farklı parametre listeleri (parametre sayısı, tipi veya sıralaması) olmalıdır.
            Parametreler: Metod Overloading, aynı metot adına sahip farklı parametrelerle çalışan birden fazla metodu içerir. Parametrelerin farklılığı, overloading metotların birbirinden ayırt edilmesini sağlar.
            İşlevi: Metod Overloading aynı işlevi yerine getiren farklı metotları aynı sınıf içinde gruplandırmak için kullanılır. Bu, metotları daha okunabilir ve kullanılabilir hale getirir.
            İşlem Zamanı Bağlamı: Metod Overloading, işlem zamanında (compile-time) bağlama (binding) ile çalışır. Hangi metotun çağrılacağı, çağrının parametrelerine ve parametrelerin türlerine bağlı olarak derleme anında belirlenir.
         Method Overriding:
            Açıklama: Metod Overriding, bir alt sınıfın üst sınıfın aynı adlı ve imzalı (signature) bir metodunu yeniden uyguladığı bir mekanizmadır. Yani alt sınıf, üst sınıfın metodu ile aynı isme ve parametre imzasına sahip bir metodu tekrar tanımlar.
            Parametreler: Metod Overriding, üst sınıfın metodu ile aynı parametre listesine sahip olmalıdır. İmza (signature) aynı olmalıdır.
            İşlevi: Metod Overriding, alt sınıfın üst sınıfın metotlarını özelleştirmesini sağlar. Alt sınıf, üst sınıfın metodu ile aynı adı taşıdığında, bu metodu kendi gereksinimlerine göre uyarlayabilir.
            İşlem Zamanı Bağlamı: Metod Overriding, işlem zamanında (runtime) bağlama ile çalışır. Hangi metotun çağrılacağı, nesnenin gerçek türüne bağlı olarak çalışma zamanında belirlenir.

         Özetlemek gerekirse, Metod Overloading aynı sınıf içinde farklı parametre listelerine sahip metotları tanımlamak için kullanılırken, Metod Overriding üst sınıfın metotlarını alt sınıflar tarafından özelleştirmek için kullanılır. Ayrıca, Overloading işlem zamanında bağlama ile çalışırken, Overriding çalışma zamanında bağlama ile çalışır.

      6-) Abstract class ve interface arasındaki farklar nelerdir ?
            •	Abstract class  ve interface, soyut yöntemleri bildirebileceğimiz soyutlama sağlamak için kullanılır. Abstract class  ve interface, doğrudan örneklendirilemez.
            •	Abstract class , soyut ve soyut olmayan yöntemlere sahip olabilirken, interface yalnızca soyut yöntemlere sahip olabilir. Java 8’den itibaren, arayüzde varsayılan ve statik yöntemler de bulunabilir.
            •	Abstract class , birden fazla kalıtımı desteklemezken, interface birden fazla kalıtımı destekler.
            •	Abstract class , final, final olmayan, statik ve statik olmayan değişkenlere sahip olabilirken, interface yalnızca statik ve final değişkenlere sahip olabilir.
            •	Abstract class , bir arayüzün uygulanmasını sağlayabilirken, interface bir soyut sınıfın uygulanmasını sağlayamaz.
            •	Abstract class  bildirimi için abstract anahtar kelimesi kullanılırken, interface bildirimi için interface anahtar kelimesi kullanılır.
            •	Bir Abstract class  başka bir Java sınıfını genişletebilir ve birden fazla Java interface uygulayabilirken, bir arayüz yalnızca başka bir Java arayüzünü genişletebilir.
            •	Bir Java Abstract classı , özel, korumalı vb. gibi sınıf üyelerine sahip olabilirken, bir Java interface üyeleri varsayılan olarak herkese açıktır.
        Örneğin:
            public abstract class Sekil {
                public abstract void ciz();
            }
            public interface Cizilebilir {
                void ciz();
            }
                Bu örnekte Sekil adında bir Abstract class  ve  Cizilebilir adında bir interface tanımlanmıştır.


        7-)  Private – Protected arasındaki farklar nelerdir

            •	Private anahtar kelimesi, yalnızca tanımlandığı sınıf içinde erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır. Protected anahtar kelimesi, tanımlandığı sınıfın alt sınıfları ve aynı paketteki diğer sınıflar tarafından erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır.
            •	Private anahtar kelimesi, yalnızca tanımlandığı sınıf içinde erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır. Protected anahtar kelimesi, tanımlandığı sınıfın alt sınıfları ve aynı paketteki diğer sınıflar tarafından erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır.
            •	Private anahtar kelimesi, yalnızca tanımlandığı sınıf içinde erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır. Protected anahtar kelimesi, tanımlandığı sınıfın alt sınıfları ve aynı paketteki diğer sınıflar tarafından erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır.
            •	Private anahtar kelimesi, yalnızca tanımlandığı sınıf içinde erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır. Protected anahtar kelimesi, tanımlandığı sınıfın alt sınıfları ve aynı paketteki diğer sınıflar tarafından erişilebilir olan değişkenleri ve yöntemleri belirtmek için kullanılır.
            Örneğin:

                public class Araba {
                    private String model;
                    protected String marka;

                    public Araba(String model, String marka) {
                        this.model = model;
                        this.marka = marka;
                    }

                    private void ozelMetod() {
                        System.out.println("Bu özel bir metoddur.");
                    }

                    protected void korumaliMetod() {
                        System.out.println("Bu korumalı bir metoddur.");
                    }
                }

                Bu örnekte Araba adında bir Java sınıfı tanımlanmıştır. model adında bir özel değişken ve marka adında bir korumalı değişken bulunmaktadır. Ayrıca ozelMetod() adında bir özel metod ve korumaliMetod() adında bir korumalı metod da bulunmaktadır.

        8-) Java'da constructor overloading nedir ?

            Java'da constructor overloading , bir sınıfta birden fazla kurucu (constructor) tanımlamak anlamına gelir. Bu constructor, farklı parametre listeleri (parametre sayısı, türü veya sıralaması) ile tanımlanır. Bu sayede aynı sınıf içinde farklı türde veya sayıda parametre alan nesneler oluşturabilirsiniz.
            Örnek olarak, aşağıda bir sınıfta constructor overloading kullanımını gösteren bir Java kodu bulunmaktadır:

                public class Ogrenci {
                    private String ad;
                    private int yas;

                    // Parametresiz kurucu
                    public Ogrenci() {
                        ad = "Bilinmiyor";
                        yas = 0;
                    }
                    // Ad bilgisi verilen kurucu
                    public Ogrenci(String ad) {
                        this.ad = ad;
                        yas = 0; // Varsayılan yaş değeri
                    }
                    // Ad ve yaş bilgisi verilen kurucu
                    public Ogrenci(String ad, int yas) {
                        this.ad = ad;
                        this.yas = yas;
                    }
                    // Diğer metotlar ve özellikler
                }

                Yukarıdaki örnekte, Ogrenci sınıfında farklı parametre listelerine sahip üç ayrı constructor tanımlanmıştır. Birinci constructor parametresizdir ve varsayılan değerlerle bir öğrenci nesnesi oluşturur. İkinci constructor sadece ad bilgisini alırken, üçüncü constructor ad ve yaş bilgilerini alır. Bu sayede farklı şekillerde öğrenci nesneleri oluşturabilirsiniz:

                    Ogrenci ogrenci1 = new Ogrenci();             // Ad: Bilinmiyor, Yaş: 0
                    Ogrenci ogrenci2 = new Ogrenci("Ahmet");      // Ad: Ahmet, Yaş: 0
                    Ogrenci ogrenci3 = new Ogrenci("Mehmet", 20); // Ad: Mehmet, Yaş: 20

                Constructor overloading, sınıfın kullanımını daha esnek hale getirir ve farklı durumlara uygun nesneler oluşturmanıza olanak tanır. Her constructor, farklı parametreleri işleyebilir ve nesnenin başlangıç durumunu belirleyebilir. Bu, Java'da çok sık kullanılan bir tekniktir ve sınıfların çeşitli özelliklere sahip nesneleri temsil etmesine yardımcı olur.


        9-) Java da süper anahtar kelimesi ne işe yarar ?

            Bir sınıfın üst sınıfının (superclass) üyelerine ve kurucularına erişim sağlar. "super" anahtar kelimesi aşağıdaki iki temel kullanım alanına sahiptir:
            Üst Sınıf Üyelerine Erişim:  Bir alt sınıf (subclass) içinde, üst sınıfın tanımladığı bir üyeye (alan veya metot) erişmek için "super" kullanılır. Özellikle alt sınıfın kendi üyeleri ile aynı isme sahip bir üye varsa ve alt sınıf bu üyeyi gizlemek yerine üst sınıfın üyesine erişmek istiyorsa "super" kullanılır.
            Örnek:

                class UstSinif {
                    int sayi = 10;
                }

                class AltSinif extends UstSinif {
                    int sayi = 20;

                    void yazdir() {
                        System.out.println("Alt sınıfın sayısı: " + sayi);
                        System.out.println("Üst sınıfın sayısı: " + super.sayi); // Üst sınıfın üyesine erişim
                    }
                }

            Üst Sınıfın Kurucusunu Çağırma:  Alt sınıfın kurucusu (constructor), üst sınıfın kurucusunu çağırmak için "super" kullanabilir. Bu, alt sınıfın kendi kurucusu içinde, üst sınıfın başlangıç işlemlerini tamamlamasını sağlar.
            Örnek:

                class UstSinif {
                    UstSinif() {
                        System.out.println("Üst sınıfın kurucusu");
                    }
                }

                class AltSinif extends UstSinif {
                    AltSinif() {
                        super(); // Üst sınıfın kurucusunu çağırma
                        System.out.println("Alt sınıfın kurucusu");
                    }
                }

                "super" anahtar kelimesi, sınıf hiyerarşilerini yönetmek ve üst sınıfın işlevselliğine erişim sağlamak için kullanılır. Bu şekilde, alt sınıflar, üst sınıfların işlevselliğini genişletebilir veya özelleştirebilirler.


        10-) Static Metot , Değişken ve Sınıflar nelerdir ?

            Static Metotlar (Static Methods):
            Açıklama: Static metotlar, bir sınıfa ait olan ve nesne oluşturmadan doğrudan sınıf adıyla çağrılabilen metotlardır. Nesne oluşturulmasına gerek olmadan sınıf düzeyinde işlem yapmak için kullanılırlar.
            Kullanım: Özellikle yardımcı işlevler veya matematiksel işlemler gibi nesneyle bağlantılı olmayan işlemlerde kullanılır.
            Örnek:

                public class Matematik {
                    public static int topla(int x, int y) {
                        return x + y;
                    }
                }
                Kullanım: int sonuc = Matematik.topla(5, 3);

            Static Değişkenler (Static Variables):
            Açıklama: Static değişkenler, sınıf düzeyinde paylaşılan değişkenlerdir. Her sınıf için bir tane oluşturulur ve tüm nesneler bu değişkeni paylaşır. Yani aynı sınıftan türetilmiş nesneler arasında değerler paylaşılır.
            Kullanım: Özellikle sabit değerler veya tüm nesneler tarafından paylaşılması gereken veriler için kullanılır.
            Örnek:

                public class Ogrenci {
                    static int ogrenciSayisi = 0; // Tüm Ogrenci nesneleri tarafından paylaşılır
                    String ad;

                    public Ogrenci(String ad) {
                        this.ad = ad;
                        ogrenciSayisi++;
                    }
                }

            Static Sınıflar (Static Classes):
            Açıklama: Static sınıflar, iç içe sınıflardır ve dışındaki sınıfın bir örneği oluşturulmadan doğrudan erişilebilirler. Genellikle yardımcı sınıflar veya özel işlevler için kullanılırlar.
            Kullanım: Yardımcı sınıflar, özel veri yapıları veya özel işlevleri gruplamak ve düzenlemek için kullanılır.
            Örnek:

                public class DigerSınıf {
                    static class YardimciSınıf {
                        void yardimciMetot() {
                            // ...
                        }
                    }
                }
                Kullanım: DigerSınıf.YardimciSınıf yardimci = new DigerSınıf.YardimciSınıf();

            Özetlemek gerekirse, static metotlar nesne oluşturmadan doğrudan sınıf düzeyinde işlem yapmak için kullanılırken, static değişkenler sınıfın tüm nesneleri tarafından paylaşılan verileri temsil eder. Static sınıflar ise iç içe sınıflardır ve dış sınıfın örneği oluşturulmadan kullanılabilir, genellikle yardımcı sınıflar veya özel işlevler için kullanılırlar.


        11-)  System.out.println ne işe yarar ?

            System.out.println Java'da yaygın olarak kullanılan bir metottur ve metni konsola (çoğunlukla komut satırı) yazdırmak için kullanılır. Bu metot, Java'nın standart kütüphanesinde (java.lang.System sınıfında) yer alır ve metin çıktısını göstermek için kullanılan bir araçtır. Aşağıda System.out.println'in ne yaptığını daha ayrıntılı olarak açıklıyorum:

            System bir sınıfı temsil eder ve çeşitli sistem işlemlerini gerçekleştirmek için kullanılır. Bu sınıfın içinde out adlı bir nesne bulunur.

            out System sınıfının içindeki static (sınıf düzeyinde) bir nesnedir ve java.io.PrintStream sınıfına aittir. PrintStream, metin çıktısı yazdırmak için kullanılan bir sınıftır.

            println bir metottur ve PrintStream sınıfının bir yöntemidir. Bu metodun görevi, argüman olarak aldığı metni veya veriyi konsola yazdırmaktır.

            Özetlemek gerekirse, System.out.println Java'da metin çıktısı vermek için kullanılan bir yapıdır. Bu yapı, konsola metin veya değer yazdırmak için kullanılır ve genellikle programlarınızın çalışma durumunu izlemek ve hata ayıklamak için kullanılır.

     */
}
