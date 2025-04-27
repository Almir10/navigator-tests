# Test Cases for Navigator.ba

## 1. Sekcije Test Caseova
Da bismo olakšali navigaciju kroz test caseove, ovdje su izdvojeni brojevi test caseova grupisani prema kategorijama:

### **Smoke Testovi**
- **TC_001:** Provjera da li se mapa uspješno učitava prilikom otvaranja aplikacije
- **TC_002:** Provjera da li je mapa vidljiva na mobilnim uređajima
- **TC_004:** Provjera da li search bar radi sa validnim unosom
- **TC_007:** Provjera da li selekcija kategorije ažurira mapu sa odgovarajućim lokacijama

### **Pozitivni Testovi**
- **TC_001:** Provjera da li se mapa uspješno učitava prilikom otvaranja aplikacije
- **TC_002:** Provjera da li je mapa vidljiva na mobilnim uređajima
- **TC_004:** Provjera da li search bar radi sa validnim unosom
- **TC_005:** Provjera kako tražilica obrađuje validne unose
- **TC_008:** Provjera da li klik na "Kreiraj Objekat" otvara formu
- **TC_009:** Provjera da li se forma uspješno šalje sa validnim podacima
- **TC_011:** Provjera da li klik na "Predloži Ideju" otvara formu za slanje povratne informacije
- **TC_012:** Provjera da li se povratna informacija uspješno šalje kada su svi podaci validni

### **Negativni Testovi**
- **TC_003:** Provjera ponašanja aplikacije kada mapa ne može da se učita (npr. problem s mrežom)
- **TC_006:** Provjera kako tražilica obrađuje nevalidne unose
- **TC_010:** Provjera da li aplikacija sprječava slanje forme sa nevalidnim podacima
- **TC_013:** Provjera da li aplikacija sprječava slanje nevalidne povratne informacije (npr. prazno polje)
- **TC_018:** Provjera ponašanja kada neprijavljeni korisnik pokušava dodati komentar
- **TC_017:** Provjera ponašanja kada se pojavi greška prilikom lajkanja objekta
- **TC_026:** Provjera da li aplikacija sprječava slanje izmjena sa nevalidnim podacima
- **TC_032:** Provjera ponašanja aplikacije na SQL injection napade

---



## **2. Svi testni slučajevi po funkciji:** 

## 1. Map Load (Učitavanje Mape)
- **TC_001:** Provjera da li se mapa uspješno učitava prilikom otvaranja aplikacije
- **TC_002:** Provjera da li je mapa vidljiva na mobilnim uređajima
- **TC_003:** Provjera ponašanja aplikacije kada mapa ne može da se učita (npr. problem s mrežom)

## 2. Search bar
- **TC_004:** Provjera da li search bar radi sa validnim unosom
- **TC_005:** Provjera kako tražilica obrađuje validne unose
- **TC_006:** Provjera kako tražilica obrađuje nevalidne unose
- **TC_007:** Provjera da li selekcija kategorije ažurira mapu sa odgovarajućim lokacijama

## 3. Kreiraj Objekat (Create Object)
- **TC_008:** Provjera da li klik na "Kreiraj Objekat" otvara formu
- **TC_009:** Provjera da li se forma uspješno šalje sa validnim podacima
- **TC_010:** Provjera da li aplikacija sprječava slanje forme sa nevalidnim podacima

## 4. Predloži Ideju ili ostavi komentar (Submit Idea or Leave a Comment)
- **TC_011:** Provjera da li klik na "Predloži Ideju" otvara formu za slanje povratne informacije ili komentara
- **TC_012:** Provjera da li se povratna informacija ili komentar uspješno šalje kada su svi podaci validni
- **TC_013:** Provjera da li aplikacija sprječava slanje nevalidne povratne informacije (npr. prazno polje)

## 5. Komentari nad Objektima (Add/Edit/Delete)
- **TC_014:** Provjera da li prijavljeni korisnik može dodati komentar
- **TC_015:** Provjera da li prijavljeni korisnik može urediti svoj komentar
- **TC_016:** Provjera da li korisnik može obrisati svoj komentar
- **TC_017:** Provjera da li neprijavljeni korisnik može ostaviti komentar
- **TC_018:** Provjera da li se otvara pop-up za prijavu kada neprijavljeni korisnik pokušava dodati komentar

## 6. Lajkanje Objekta
- **TC_019:** Provjera da li lajkanje objekta radi ispravno
- **TC_020:** Provjera ponašanja kada se pojavi greška prilikom lajkanja objekta

## 7. Društvene Mreže (Navigacija i Interakcija)
- **TC_021:** Provjera da li klik na Facebook ikonu otvara tačnu Facebook stranicu Navigator.ba
- **TC_022:** Provjera da li klik na Twitter ikonu otvara tačan Twitter profil Navigator.ba
- **TC_023:** Provjera funkcionalnosti "Like" na Facebook-u
- **TC_024:** Provjera funkcionalnosti "Follow" na Twitter-u
- **TC_025:** Provjera funkcionalnosti "Share" na Facebook-u
- **TC_026:** Provjera ponašanja kada korisnik nije prijavljen na društvene mreže

## 8. Performanse Aplikacije
- **TC_027:** Provjera vremena učitavanja aplikacije
- **TC_028:** Provjera rada aplikacije pod opterećenjem

## 10. Error Handling
- **TC_029:** Provjera ponašanja za nepostojeći URL ili kategoriju
- **TC_030:** Provjera ponašanja aplikacije kada API ne odgovara
- **TC_031:** Provjera ponašanja aplikacije na SQL injection napade

---


## **3. Svi testni slučajevi po funkciji - detaljan opis:** 


## 1. Map Load (Učitavanje Mape)

### TC_001: Provjera da li se mapa uspješno učitava prilikom otvaranja aplikacije
- **ID:** TC_001
- **Test Scenario:** Učitavanje mape
- **Testni Slučaj:** Provjeriti da li se mapa uspješno učitava prilikom otvaranja aplikacije.
- **Preduslov:** Korisnik ima stabilnu mrežnu vezu.
- **Koraci:**
    1. Otvori Navigator.ba aplikaciju u pregledniku.
    2. Sačekaj da se mapa učita.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Mapa se uspješno učitava i prikazuje u centru ekrana bez grešaka.
- **Post-Uslovi:** Mapa je vidljiva i operativna.

---

### TC_002: Provjera da li je mapa vidljiva na mobilnim uređajima
- **ID:** TC_002
- **Test Scenario:** Učitavanje mape na mobilnim uređajima
- **Testni Slučaj:** Provjeriti da li je mapa vidljiva i funkcionalna na mobilnim uređajima.
- **Preduslov:** Korisnik koristi mobilni uređaj s pristupom internetu.
- **Koraci:**
    1. Otvori Navigator.ba u mobilnom pregledniku.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Mapa se učitava bez grešaka i omogućava interakciju (pomjeranje, klik na objekte).
- **Post-Uslovi:** Mapa funkcioniše normalno na mobilnom uređaju.

---

### TC_003: Provjera ponašanja aplikacije kada mapa ne može da se učita (npr. problem s mrežom)
- **ID:** TC_003
- **Test Scenario:** Ponašanje aplikacije pri grešci učitavanja mape
- **Testni Slučaj:** Provjeriti kako aplikacija reaguje kada se mapa ne može učitati zbog problema s mrežom.
- **Preduslov:** Korisnik ima nestabilnu mrežnu vezu ili nema internet.
- **Koraci:**
    1. Otvori Navigator.ba dok je internet konekcija prekinuta.
    2. Sačekati da aplikacija pokuša učitati mapu.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija prikazuje korisniku poruku o grešci "Mapa se ne može učitati. Provjerite internet vezu."
- **Post-Uslovi:** Aplikacija ostaje stabilna.

---

## 2. Search Bar 

### TC_004: Provjera da li search bar radi sa validnim unosom
- **ID:** TC_004
- **Test Scenario:** Funkcionalnost tražilice
- **Testni Slučaj:** Provjeriti da li tražilica omogućava pretragu sa validnim unosom.
- **Preduslov:** Aplikacija je učitana i search bar je vidljiv.
- **Koraci:**
    1. Unesi validan pojam u tražilicu (npr. "Restoran").
    2. Klikni na dugme za pretragu ili pritisni Enter.
- **Testni Podaci:** "Restoran"
- **Očekivani Rezultat:** Rezultati pretrage se prikazuju na mapi i u listi ispod tražilice.
- **Post-Uslovi:** Aplikacija prikazuje tačne rezultate pretrage.

---

### TC_005: Provjera kako search bar obrađuje validne unose
- **ID:** TC_005
- **Test Scenario:** Obrada validnih unosa u tražilici
- **Testni Slučaj:** Provjeriti da li tražilica ispravno obrađuje razne validne unose.
- **Preduslov:** Aplikacija je učitana i tražilica je vidljiva.
- **Koraci:**
    1. Unesi validan pojam u tražilicu (npr. "Hotel Sarajevo").
    2. Klikni na dugme za pretragu ili pritisni Enter.
- **Testni Podaci:** "Hotel Sarajevo"
- **Očekivani Rezultat:** Rezultati pretrage se prikazuju na mapi i u listi ispod tražilice, a mapa se fokusira na odgovarajuću lokaciju.
- **Post-Uslovi:** Aplikacija prikazuje tačne rezultate pretrage.

---

### TC_006: Provjera kako search bar obrađuje invalidne unose
- **ID:** TC_006
- **Test Scenario:** Obrada nevalidnih unosa u search bar-u
- **Testni Slučaj:** Provjeriti kako aplikacija reaguje na nevalidne unose u tražilici.
- **Preduslov:** Aplikacija je učitana i search bar je vidljiv.
- **Koraci:**
    1. Unesi nevalidan pojam u search bar (npr. "#@!").
    2. Klikni na dugme za pretragu ili pritisni Enter.
- **Testni Podaci:** "#@!"
- **Očekivani Rezultat:** Aplikacija prikazuje poruku "Nema rezultata za zadani pojam."
- **Post-Uslovi:** Aplikacija ostaje stabilna i ne prikazuje greške.

---

### TC_007: Provjera da li selekcija kategorije ažurira mapu sa odgovarajućim lokacijama
- **ID:** TC_007
- **Test Scenario:** Ažuriranje mape na osnovu selekcije kategorije
- **Testni Slučaj:** Provjeriti da li izbor kategorije na tražilici ažurira prikaz na mapi.
- **Preduslov:** Aplikacija je učitana i tražilica je vidljiva.
- **Koraci:**
    1. Klikni na padajući meni za kategorije u tražilici.
    2. Izaberi kategoriju (npr. "Kafa").
    3. Sačekaj da se mapa ažurira.
- **Testni Podaci:** Kategorija "Kafa"
- **Očekivani Rezultat:** Mapa prikazuje samo lokacije koje pripadaju odabranoj kategoriji.
- **Post-Uslovi:** Prikaz mape je ažuriran prema odabranoj kategoriji.

---

## 3. Kreiraj Objekat (Create Object)

### TC_008: Provjera da li klik na "Kreiraj Objekat" otvara formu
- **ID:** TC_008
- **Test Scenario:** Otvaranje forme za kreiranje objekta
- **Testni Slučaj:** Provjeriti da li opcija "Kreiraj Objekat" otvara odgovarajuću formu.
- **Preduslov:** Korisnik mora biti prijavljen.
- **Koraci:**
    1. Klikni na dugme "Kreiraj Objekat".
    2. Sačekati da se otvori forma.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Forma za kreiranje objekta se uspješno otvara.
- **Post-Uslovi:** Forma za kreiranje objekta je vidljiva i spremna za unos podataka.

---

### TC_009: Provjera da li se forma uspješno šalje sa validnim podacima
- **ID:** TC_009
- **Test Scenario:** Slanje forme sa validnim podacima
- **Testni Slučaj:** Provjeriti da li se forma uspješno šalje kada se unesu svi validni podaci.
- **Preduslov:** Korisnik mora biti prijavljen, a forma za kreiranje objekta mora biti otvorena.
- **Koraci:**
    1. Unesi validne podatke u sva polja forme.
    2. Klikni na dugme "Pošalji".
- **Testni Podaci:** Validni podaci (npr. naziv objekta, lokacija, opis).
- **Očekivani Rezultat:** Forma se uspješno šalje, a korisnik dobija poruku o uspješnom kreiranju objekta.
- **Post-Uslovi:** Novi objekat je kreiran i prikazan na mapi ili stavljen na čekanje odobrenja.

---

### TC_010: Provjera da li aplikacija sprječava slanje forme sa nevalidnim podacima
- **ID:** TC_010
- **Test Scenario:** Validacija forme
- **Testni Slučaj:** Provjeriti da li aplikacija sprječava slanje forme kada su unijeti nevalidni podaci.
- **Preduslov:** Forma za kreiranje objekta mora biti otvorena.
- **Koraci:**
    1. Ostaviti jedno ili više polja praznim ili unijeti nevalidne podatke.
    2. Klikni na dugme "Pošalji".
- **Testni Podaci:** invalidni podaci (npr. prazno polje za naziv).
- **Očekivani Rezultat:** Aplikacija prikazuje poruku o grešci i ne dozvoljava slanje forme.
- **Post-Uslovi:** Forma ostaje otvorena sa nepromijenjenim podacima.

---

## 4. Predloži Ideju ili ostavi komentar (Submit Idea or Leave a Comment)

### TC_011: Provjera da li klik na "Predloži Ideju" otvara formu za slanje povratne informacije ili komentara
- **ID:** TC_011
- **Test Scenario:** Otvaranje forme za predlaganje ideje
- **Testni Slučaj:** Provjeriti da li opcija "Predloži Ideju ili ostavi komentar" otvara odgovarajuću formu.
- **Preduslov:** Korisnik mora biti na početnoj stranici aplikacije.
- **Koraci:**
    1. Klikni na dugme "Predloži Ideju".
    2. Sačekaj da se otvori forma.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Forma za predlaganje ideje se uspješno otvara.
- **Post-Uslovi:** Forma je vidljiva i spremna za unos podataka.

---

### TC_012: Provjera da li se povratna informacija ili komentar uspješno šalje kada su svi podaci validni
- **ID:** TC_012
- **Test Scenario:** Slanje validne povratne informacije
- **Testni Slučaj:** Provjeriti da li se povratna informacija uspješno šalje kada su svi podaci validni.
- **Preduslov:** Forma za predlaganje ideje mora biti otvorena.
- **Koraci:**
    1. Unesi validne podatke u polja forme.
    2. Klikni na dugme "Pošalji".
- **Testni Podaci:** Validni podaci (npr. naslov ideje i opis).
- **Očekivani Rezultat:** Povratna informacija se uspješno šalje, a korisnik dobija poruku o uspjehu.
- **Post-Uslovi:** Povratna informacija je evidentirana.

---

### TC_013: Provjera da li aplikacija sprječava slanje nevalidne povratne informacije (npr. prazno polje)
- **ID:** TC_013
- **Test Scenario:** Validacija povratne informacije
- **Testni Slučaj:** Provjeriti da li aplikacija sprječava slanje povratne informacije kada su unijeti nevalidni podaci.
- **Preduslov:** Forma za predlaganje ideje mora biti otvorena.
- **Koraci:**
    1. Ostaviti jedno ili više polja praznim.
    2. Klikni na dugme "Pošalji".
- **Testni Podaci:** Nevalidni podaci (npr. prazno polje za naslov).
- **Očekivani Rezultat:** Aplikacija prikazuje poruku o grešci i ne dozvoljava slanje povratne informacije.
- **Post-Uslovi:** Forma ostaje otvorena sa nepromijenjenim podacima.

---

## 5. Komentari nad Objektom (Add/Edit/Delete)

### TC_014: Provjera da li prijavljeni korisnik može dodati komentar (facebook) na objekt
- **ID:** TC_014
- **Test Scenario:** Dodavanje komentara
- **Testni Slučaj:** Provjeriti da li prijavljeni korisnik može dodati komentar na detalje objekta.
- **Preduslov:** Korisnik mora biti prijavljen na facebook i dijelu detalja objekta.
- **Koraci:**
    1. Klikni na polje za unos komentara.
    2. Unesi tekst komentara.
    3. Klikni na dugme "Dodaj".
- **Testni Podaci:** "Test komentar"
- **Očekivani Rezultat:** Komentar se uspješno dodaje i prikazuje ispod objekta.
- **Post-Uslovi:** Komentar je vidljiv na listi komentara.

---

### TC_015: Provjera da li prijavljeni korisnik može urediti svoj komentar
- **ID:** TC_015
- **Test Scenario:** Uređivanje komentara
- **Testni Slučaj:** Provjeriti da li prijavljeni korisnik može urediti svoj komentar.
- **Preduslov:** Korisnik mora biti prijavljen na facebook i imati već dodan komentar.
- **Koraci:**
    1. Klikni na opciju "Uredi" pored svog komentara.
    2. Unesi izmjene u tekst komentara.
    3. Klikni na dugme "Spremi".
- **Testni Podaci:** Izmijenjeni tekst komentara.
- **Očekivani Rezultat:** Komentar se uspješno ažurira sa novim tekstom.
- **Post-Uslovi:** Izmijenjeni komentar je vidljiv.

---

### TC_016: Provjera da li korisnik može obrisati svoj komentar
- **ID:** TC_016
- **Test Scenario:** Brisanje komentara
- **Testni Slučaj:** Provjeriti da li prijavljeni korisnik može obrisati svoj komentar.
- **Preduslov:** Korisnik mora biti prijavljen facebook i imati već dodan komentar.
- **Koraci:**
    1. Klikni na opciju "Obriši" pored svog komentara.
    2. Potvrdi brisanje kada se pojavi poruka za potvrdu.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Komentar se uspješno briše iz liste komentara.
- **Post-Uslovi:** Komentar više nije vidljiv u listi komentara.

---

### TC_017: Provjera da li neprijavljeni korisnik može ostaviti komentar
- **ID:** TC_017
- **Test Scenario:** Ograničenje dodavanja komentara za neprijavljene korisnike
- **Testni Slučaj:** Provjeriti da li aplikacija sprječava neprijavljenog korisnika da dodaje komentare.
- **Preduslov:** Korisnik nije prijavljen na facebook.
- **Koraci:**
    1. Otvori detalje objekta.
    2. Pokušaj unijeti komentar u polje za unos komentara.
    3. Klikni na dugme "Dodaj".
- **Testni Podaci:** "Test komentar"
- **Očekivani Rezultat:** Aplikacija prikazuje poruku ili otvara pop-up za prijavu korisnika.
- **Post-Uslovi:** Komentar nije dodan.

---

### TC_018: Provjera da li se otvara pop-up za prijavu kada neprijavljeni korisnik pokušava dodati komentar
- **ID:** TC_018
- **Test Scenario:** Prikazivanje pop-upa za prijavu
- **Testni Slučaj:** Provjeriti da li se otvara pop-up za prijavu kada neprijavljeni korisnik pokušava dodati komentar.
- **Preduslov:** Korisnik nije prijavljen.
- **Koraci:**
    1. Otvori detalje objekta.
    2. Pokušaj unijeti komentar u polje za unos komentara.
    3. Klikni na dugme "Dodaj".
- **Testni Podaci:** "Test komentar"
- **Očekivani Rezultat:** Otvara se pop-up za prijavu korisnika.
- **Post-Uslovi:** Komentar nije dodan.

---

## 6. Lajkanje Objekta

### TC_019: Provjera da li lajkanje objekta radi ispravno
- **ID:** TC_019
- **Test Scenario:** Funkcionalnost lajkanja objekta
- **Testni Slučaj:** Provjeriti da li korisnik može uspješno lajkovati objekat.
- **Preduslov:** Korisnik mora biti prijavljen na facebook.
- **Koraci:**
    1. Otvori detalje objekta.
    2. Klikni na dugme "Like".
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Broj lajkova se povećava za jedan i korisnik vidi potvrdu da je lajk uspješno dodan.
- **Post-Uslovi:** Broj lajkova povećan za jedan.

---

### TC_020: Provjera ponašanja kada se pojavi greška prilikom lajkanja objekta
- **ID:** TC_020
- **Test Scenario:** Greška prilikom lajkanja objekta
- **Testni Slučaj:** Provjeriti ponašanje aplikacije kada se pojavi greška prilikom lajkanja objekta.
- **Preduslov:** Korisnik mora biti prijavljen.
- **Koraci:**
    1. Otvori detalje objekta.
    2. Klikni na dugme "Like" dok postoji problem (npr. nestabilna mrežna veza).
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija prikazuje poruku o grešci i broj lajkova ostaje nepromijenjen.
- **Post-Uslovi:** Lajk nije dodan.

---

## 7. Društvene Mreže (Navigacija i Interakcija)

### TC_021: Provjera da li klik na Facebook ikonu otvara tačnu Facebook stranicu Navigator.ba
- **ID:** TC_021
- **Test Scenario:** Navigacija na Facebook stranicu
- **Testni Slučaj:** Provjeriti da li aplikacija otvara tačnu Facebook stranicu Navigator.ba kada korisnik klikne na Facebook ikonu.
- **Preduslov:** Korisnik mora imati stabilnu mrežnu vezu.
- **Koraci:**
    1. Klikni na Facebook ikonu na početnoj stranici aplikacije.
    2. Sačekaj da se otvori nova kartica ili prozor.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Tačna Facebook stranica Navigator.ba se otvara u pregledniku.
- **Post-Uslovi:** Korisnik je preusmjeren na Facebook stranicu.

---

### TC_022: Provjera da li klik na Twitter ikonu otvara tačan Twitter profil Navigator.ba
- **ID:** TC_022
- **Test Scenario:** Navigacija na Twitter profil
- **Testni Slučaj:** Provjeriti da li aplikacija otvara tačan Twitter profil Navigator.ba kada korisnik klikne na Twitter ikonu.
- **Preduslov:** Korisnik mora imati stabilnu mrežnu vezu.
- **Koraci:**
    1. Klikni na Twitter ikonu na početnoj stranici aplikacije.
    2. Sačekaj da se otvori nova kartica ili prozor.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Tačan Twitter profil Navigator.ba se otvara u pregledniku.
- **Post-Uslovi:** Korisnik je preusmjeren na Twitter profil.

---


### TC_023: Provjera funkcionalnosti "Like" na Facebook-u
- **ID:** TC_023
- **Test Scenario:** Lajkanje na Facebook-u
- **Testni Slučaj:** Provjeriti da li "Like" funkcionalnost radi ispravno na Facebook-u.
- **Preduslov:** Korisnik mora biti prijavljen na Facebook.
- **Koraci:**
    1. Klikni na dugme "Like" na Facebook integraciji u aplikaciji.
    2. Sačekaj potvrdu lajka.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Lajk je uspješno dodan na Facebook stranici.
- **Post-Uslovi:** Lajk je vidljiv na korisnikovom Facebook profilu.

---

### TC_024: Provjera funkcionalnosti "Follow" na Twitter-u
- **ID:** TC_024
- **Test Scenario:** Praćenje na Twitter-u
- **Testni Slučaj:** Provjeriti da li "Follow" funkcionalnost radi ispravno na Twitter-u.
- **Preduslov:** Korisnik mora biti prijavljen na Twitter.
- **Koraci:**
    1. Klikni na dugme "Follow" na Twitter tabu.
    2. Provjeri da li je korisnik zapratio Twitter profil Navigator.ba.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Korisnik je uspješno zapratio Navigator.ba Twitter profil.
- **Post-Uslovi:** Profil Navigator.ba je prikazan u listi korisnikovih praćenja.

---

### TC_025: Provjera funkcionalnosti "Share" na Facebook-u
- **ID:** TC_025
- **Test Scenario:** Dijeljenje sadržaja na Facebook-u
- **Testni Slučaj:** Provjeriti da li korisnik može uspješno podijeliti sadržaj putem Facebook-a.
- **Preduslov:** Korisnik mora biti prijavljen na Facebook.
- **Koraci:**
    1. Klikni na dugme "Share" pored sadržaja u aplikaciji.
    2. Odaberi opciju za dijeljenje na Facebook-u.
    3. Sačekaj potvrdu da je sadržaj podijeljen.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Sadržaj je uspješno podijeljen na korisnikovom Facebook profilu.
- **Post-Uslovi:** Sadržaj je vidljiv na korisnikovom Facebook profilu.

---

### TC_026: Provjera ponašanja kada korisnik nije prijavljen na društvene mreže
- **ID:** TC_026
- **Test Scenario:** Ponašanje aplikacije kada korisnik nije prijavljen
- **Testni Slučaj:** Provjeriti šta se događa kada korisnik koji nije prijavljen pokušava koristiti društvene mreže.
- **Preduslov:** Korisnik nije prijavljen na Facebook ili Twitter.
- **Koraci:**
    1. Klikni na "Like", "Follow" ili "Share" dugme u aplikaciji.
    2. Provjeri da li aplikacija traži prijavu.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija prikazuje poruku ili otvara stranicu za prijavu na društvene mreže.
- **Post-Uslovi:** Radnja nije izvršena dok se korisnik ne prijavi.

---
## 8. Performanse Aplikacije

### TC_027: Provjera vremena učitavanja aplikacije
- **ID:** TC_027
- **Test Scenario:** Performanse aplikacije
- **Testni Slučaj:** Provjeriti da li se aplikacija učitava unutar prihvatljivog vremenskog okvira.
- **Preduslov:** Korisnik ima stabilnu mrežnu vezu.
- **Koraci:**
    1. Otvori aplikaciju u pregledniku.
    2. Izmjeri vrijeme potrebno za potpuno učitavanje aplikacije.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija se učitava unutar određenog vremena (npr. 3 sekunde).
- **Post-Uslovi:** Aplikacija je potpuno učitana i spremna za upotrebu.

---

### TC_028: Provjera rada aplikacije pod opterećenjem
- **ID:** TC_028
- **Test Scenario:** Performanse pod opterećenjem
- **Testni Slučaj:** Provjeriti kako aplikacija radi kada je pod velikim opterećenjem (npr. više istovremenih korisnika).
- **Preduslov:** Simulacija opterećenja kroz alate poput JMeter-a.
- **Koraci:**
    1. Simuliraj 100+ istovremenih korisnika kroz alat za testiranje performansi.
    2. Prati ponašanje aplikacije (odgovor, vrijeme učitavanja, greške).
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija radi stabilno i odgovara unutar prihvatljivog vremenskog okvira.
- **Post-Uslovi:** Aplikacija zadržava stabilnost i funkcionalnost.

---

## 10. Error Handling

### TC_029: Provjera ponašanja za nepostojeći URL ili kategoriju
- **ID:** TC_029
- **Test Scenario:** Greške pri unosu nepostojećih URL-ova
- **Testni Slučaj:** Provjeriti kako aplikacija reaguje kada korisnik unese nepostojeći URL ili kategoriju.
- **Preduslov:** Aplikacija je otvorena.
- **Koraci:**
    1. Unesi nepostojeći URL u browser.
    2. Pokušaj pristupiti nepostojećoj kategoriji.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija prikazuje korisniku stranicu "404 - Not Found" ili odgovarajuću poruku.
- **Post-Uslovi:** Aplikacija ostaje stabilna.

---

### TC_030: Provjera ponašanja aplikacije kada API ne odgovara
- **ID:** TC_030
- **Test Scenario:** Greške API-ja
- **Testni Slučaj:** Provjeriti kako aplikacija reaguje kada API ne odgovara.
- **Preduslov:** Simulacija greške API-ja.
- **Koraci:**
    1. Onemogući API odgovore.
    2. Pokušaj učitati podatke u aplikaciji.
- **Testni Podaci:** N/A
- **Očekivani Rezultat:** Aplikacija prikazuje korisniku poruku o grešci (npr. "Podaci trenutno nisu dostupni").
- **Post-Uslovi:** Aplikacija ostaje funkcionalna uz prikaz greške.

---

### TC_031: Provjera ponašanja aplikacije na SQL injection napade
- **ID:** TC_031
- **Test Scenario:** Sigurnost aplikacije
- **Testni Slučaj:** Provjeriti kako aplikacija reaguje na SQL injection napade.
- **Preduslov:** Aplikacija koristi bazu podataka za pretragu i unos podataka.
- **Koraci:**
    1. Unesi SQL injection u polje za unos (npr. `' OR '1'='1`).
    2. Klikni na dugme za pretragu ili unos podataka.
- **Testni Podaci:** `' OR '1'='1`
- **Očekivani Rezultat:** Aplikacija spriječava SQL injection napade i prikazuje poruku o grešci.
- **Post-Uslovi:** Aplikacija ostaje sigurna i stabilna.