package org.example;

public class OOPJava {

    /*


        1-) Java tarafından desteklenen Nesne Yönelimli Özellikler nelerdir?

            Abstraction (Soyutlama)

                Kullanıcıya sadece yapabileceği işleri göstermek ama nasıl yapıldığını gizlemektir. (implementation)
                Pano örneği - düğmeler
                Bir pano da biz sadece düğmeleri görürüz düğmenin arkasındaki kabloları vb görmeyiz.
                Javada iki şekilde yapılır.
                •	Abstract class
                •	Interface (%100 abstraction sağlanır)


            Encapsulation(Kapsülleme)

                Bir class içindeki dataların dış dünyadan gizlenmesi için kullanılır.
                Bunun için Access modifere kullanılır.
                Bu datalara erişim içinde public tanımlı getter setter kullanılır.

                Örnek olarak bir arabanın kaputunu düşünebiliriz. Kaputun altındaki motor vb erişim için kaputu açmak için bir düğme kullanırız. Burada motoru datamız olarak düşünürsek kaputumuz Access motife , düğme ise getter setter görevini yerine getiriyor.

            Inheritance ( Kalıtım )

                Bir sınıfın kalıtım ile atasındaki özellikleri miras almasını sağlar.

                İki şekilde gerçekleşir:
                •	Extends: Bir sınıfın başka sınıftan türetilmesi.
                •	İmplements: Bir sınıfın interface'deki metotlarının kodlarını gerçekleştirmesidir.

                Çoklu kalıtım javada yok.

            Polymorphism ( Çok biçimcilik )

                Tanımlı metodun farklı şekilde,biçimde çalışabilmesini sağlar.

                Overloading ( static binding ) : Aynı metodun farklı parametre sayısı farklı parametre tipleriyle aynı sınıfın içinde tanımlanmasıyla gerçekleşir. Kalıtıma ihtiyaç yok.

                Overriding ( dynamic bining ) : Türetilen sınıfın atasındaki bir metodu değiştirmek için kullanıyoruz. Kalıtım lazım.


        2-)Java’da kullanılan farklı erişim belirleyiciler nelerdir?

            public (Herkes): public erişim belirleyici, ilgili öğenin herhangi bir sınıf veya paketten erişilebilir olduğunu gösterir. Yani herkes bu öğeye erişebilir.
            protected (Alt Sınıflar ve Aynı Paket): protected belirleyici, aynı paketten veya alt sınıflardan erişilebilir olduğunu gösterir. Yani sınıfın alt sınıfları ve aynı paket içindeki diğer sınıflar bu öğeye erişebilir.
            default (Sadece Aynı Paket): Erişim belirleyici belirtilmediğinde, yani hiçbir şey belirtilmediğinde, varsayılan erişim belirleyici kullanılır. Bu durumda, sadece aynı paketten erişilebilir. Yani başka paketlerdeki sınıflar bu öğeye erişemez.
            private (Sadece Aynı Sınıf): private erişim belirleyici, yalnızca aynı sınıf içinden erişilebilir olduğunu gösterir. Başka hiçbir sınıf bu öğeye erişemez.
            Bu erişim belirleyicileri, bir sınıfın içindeki verilere veya yöntemlere diğer sınıflardan nasıl erişilebileceğini kontrol etmek için kullanılır ve Java'nın güvenlik ve veri gizliliği mekanizmalarının temelini oluşturur.

        3-)Kompozisyon (Composition) ve kalıtım (inheritance) arasındaki fark nedir?

            Kalıtım (Inheritance):
                Kalıtım, bir sınıfın (alt sınıf veya türetilmiş sınıf) başka bir sınıftan (üst sınıf veya temel sınıf) özellikleri ve davranışlarını miras almasını sağlar.
                Alt sınıf, üst sınıfın sahip olduğu tüm public ve protected özelliklere ve davranışlara erişebilir.
                Kalıtım "is-a" ilişkisini temsil eder. Örneğin, "Kuş bir Hayvan'dır" ifadesi kalıtımı tanımlar.
                Kalıtım, kodun yeniden kullanılmasını kolaylaştırır, ancak sıkı bir bağlantı oluşturur ve değişikliklerin yayılmasını zorlaştırabilir.
            Kompozisyon (Composition):
                Kompozisyon, bir sınıfın başka bir sınıfı içermesini sağlar. Yani bir sınıf, başka bir sınıfın nesnesini içerir ve bu nesne üzerinden işlem yapabilir.
                Bu ilişki "has-a" ilişkisini temsil eder. Örneğin, "Araba bir Motor'a sahiptir" ifadesi kompozisyonu tanımlar.
                Kompozisyon, daha az sıkı bir bağlantı oluşturur ve değişiklikleri daha esnek hale getirir, çünkü bir sınıfın içeriği diğer sınıfın özel bir nesnesi olarak saklanır ve değiştirilmesi daha kolaydır.
                Her iki sınıf da kendi davranışlarını ve özelliklerini korur ve bu, karmaşıklığın gizlenmesine ve daha modüler kod oluşturulmasına yardımcı olur.

            Özetle, kalıtım, bir sınıfın diğerinin özelliklerini ve davranışlarını miras almasını sağlar, while kompozisyon, bir sınıfın başka bir sınıfı içermesini ve onun işlevselliğini kullanmasını sağlar. Hangi yöntemin kullanılacağı, projenin ihtiyaçlarına ve tasarım hedeflerine bağlı olarak değişebilir.


        4-)Abstract class’ın amacı nedir?

            Yöntem Şablonları Sağlamak: abstract class’lar soyut (abstract) yöntemler içerebilir. Bu yöntemlerin gövdeleri abstract class’ta tanımlanmaz, yalnızca başlık (imza) belirtilir. Alt sınıflar, bu soyut yöntemleri uygulamak zorunda kalır. Bu, alt sınıfların belirli bir davranışı uygulamalarını sağlar ve kodun daha tutarlı hale gelmesine yardımcı olur.
            Kod Paylaşımı ve Yeniden Kullanımı:  abstract class’lar, benzer işlevselliği paylaşan alt sınıfların ortak özelliklerini tanımlamak için kullanılabilir. Bu, kodun yeniden kullanılmasını ve bakımını kolaylaştırır.
            Polimorfizm Desteği: abstract class’lar, farklı alt sınıfların aynı abstract class türünü kullanmasına olanak tanır. Bu, polimorfizm prensiplerini destekler ve nesnelerin farklı türlerine aynı şekilde erişim sağlar.
            Kapsülleme ve Veri Gizliliği: abstract class’lar, alt sınıfların belirli özelliklere ve davranışlara erişimini kontrol etmek için kullanılabilir. Bu, veri gizliliğini ve güvenliği artırabilir.

            Özetle, abstract class’lar, benzer sınıflar arasındaki ortak davranışları tanımlamak ve alt sınıfların bu davranışları uygulamalarını zorlamak için kullanılır. Bu, kodun daha organize edilmesine, bakımının kolaylaştırılmasına ve genel tasarımın geliştirilmesine yardımcı olur. Ancak abstract class’ların doğrudan örnekleri oluşturulamaz, yalnızca alt sınıfları için bir şablondur.


        5-)Sınıfın constructor (yapıcı) ile method (yöntem) arasındaki farklar nelerdir?

            Constructor:
                Ad ve Geri Dönüş Tipi: Bir constructor, sınıfın adıyla aynıdır ve geri dönüş tipi yoktur. Yapıcılar bir nesne oluşturulurken çağrılır ve nesnenin başlatılmasını sağlarlar.
                Çok Sayıda Olabilir: Bir sınıfın birden fazla constructorı olabilir. Ancak bu constructorlar farklı parametre listelerine sahip olmalıdır (yani aşırı yüklenmelidirler).
                New Anahtar Kelimesi ile Çağrılır: constructorlar, bir nesne oluşturmak için "new" anahtar kelimesi ile çağrılır. Örneğin, new MyClass() şeklinde kullanılır.
                İlgili Nesnenin Başlatılması: constructorlar, nesnenin başlatılmasını ve başlangıç değerlerinin atanmasını sağlarlar.
                Varsayılan Constructor: Eğer bir sınıfın hiçbir constructorı tanımlanmamışsa, Java otomatik olarak bir varsayılan yapıcı oluşturur.
            Method:
                Ad ve Geri Dönüş Tipi: Bir metodun adı ve geri dönüş tipi vardır. Metodlar sınıf içindeki belirli bir işlemi veya davranışı tanımlar ve bu işlemi çağırmak için kullanılır.
                Çok Sayıda Olabilir: Bir sınıfta birden fazla metod olabilir. Bu metodlar aynı adı taşıyabilir, ancak farklı parametre listelerine sahip olmalıdır (yani aşırı yüklenmelidirler).
                New Anahtar Kelimesi ile Değil, Sınıf Üzerinden Çağrılmaz: Metodlar , nesne oluşturmak için değil, sınıfın mevcut nesneleri üzerinde işlem yapmak için çağrılır.
                Belirli Bir İşlemi Tanımlar: Metodlar, belirli bir işlemi veya davranışı gerçekleştirmek için kullanılır. Örneğin, veri manipülasyonu, hesaplamalar veya nesne durumunu değiştirme gibi işlevselliği uygularlar.
                Hem Parametreli Hem de Parametresiz Olabilirler: Metodlar parametreli veya parametresiz olabilirler ve her çağrıda farklı sonuçlar üretebilirler.

            Özetle, constructor sınıfların nesnelerini başlatmak için kullanılırken, metodlar sınıfların davranışlarını tanımlamak ve sınıfın nesneleri üzerinde işlem yapmak için kullanılır. Constructor "new" ile çağrılırken, metodlar sınıfın nesnesi üzerinden çağrılır.


        6-)Java’da elmas problemi (diamond problem) nedir ve nasıl çözülür?

            Elmas problemi, bir sınıfın iki farklı yoldan aynı üst sınıfı miras aldığında ortaya çıkar.
            Bu sorunu çözmek için, Java'da sadece bir sefer miras alınan üst sınıfın özelliklerini ve davranışlarını içeren bir ara sınıf otomatik olarak oluşturulur.

        7-)Java’da yerel ve örnek değişkenleri arasındaki fark nedir?

            Yerel değişkenler, bir yöntem içinde tanımlanır ve sadece o yöntem içinde erişilebilir.
            Örnek değişkenler, bir sınıfın alanlarıdır ve sınıfın tüm yöntemleri içinde kullanılabilir.

     */
}
