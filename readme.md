Mikroservislere Giriş Projesi
-----------------------------

Başlatma Sırası:
1) config-service (Spring-cloud-config)
2) discovery-service (Eureka)
3) Örnek mikroservisler (department, employee, organization)
4) proxy-service (API GW / Zuul)

Terminalden projeleri başlatmak için şu komutu kullanın:
> mvn spring-boot:run

ÖNEMLİ! Yalnızca Config-service'in git repo yerine lokaldeki config dosyalarını okuması için profil adı olarak "native" vermemiz gerekiyor. İlgili komut:
 > mvn spring-boot:run -Dspring-boot.run.profiles=native


Tüm projeler başladıktan sonra:
-------------------------------
<b>Eureka Dashboard:</b> http://localhost:8061

<b>Swagger UI (API Documentation):</b> http://localhost:8060/swagger-ui.html

<b>Örnek API çağrısı (API GW Üzerinden):</b> http://localhost:8060/organization/
