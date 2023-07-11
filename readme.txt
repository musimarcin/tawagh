1. Wprowadzenie przedmiotów do systemu :
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
"nazwa" : "Metodologie obiektowe",
"ects" : 2,
"sala" : 216,
"egzamin" : "tak"
}
{
"nazwa" : "Testowanie oprogramowania",
"ects" : 1,
"sala" : 216,
"egzamin" : "nie"
}
{
"nazwa" : "Technologie i aplikacje webowe”,
"ects" : 3,
"sala" : 208,
"egzamin" : "nie"
}
{
"nazwa" : "Zarządzanie projektem informatycznym",
"ects" : 2,
"sala" : 216,
"egzamin" : "nie"
}
{
"nazwa" : "Zaawansowane technologie bazodanowe",
"ects" : 3,
"sala" : 208,
"egzamin" : "nie"
}
{
"nazwa" : "Technologie komponentowe i sieciowe",
"ects" : 2,
"sala" : 208	,
"egzamin" : "tak"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak






2.Pobranie wszystkich przedmiotów :
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 2,
"nazwa": "Testowanie oprogramowania",
"ects": 1,
"sala": 216,
"egzamin": "nie"
},
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ects": 2,
"sala": 216,
"egzamin": "nie"
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 6,
"nazwa": "Technologie komponentowe I sieciowe",
"ects": 2,
"sala": 208,
"egzamin": "tak"
}
]

3Przedmioty posiadające egzamin
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?exam=tak
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 6,
"nazwa": "Technologie komponentowe I sieciowe",
"ects": 2,
"sala": 208,
"egzamin": "tak"
}
]

4. Pobranie przedmiotów w sali 216:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?room=216
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 2,
"nazwa": "Testowanie oprogramowania",
"ects": 1,
"sala": 216,
"egzamin": "nie"
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ects": 2,
"sala": 216,
"egzamin": "nie"
}
]

5. Pobranie przedmiotów bez egzaminu w sali 208:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?exam=nie&room=208
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
}
]

6. Pobranie przedmiotu o id 3
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities/3
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
}
]
7. Pobranie przedmiotu o id 15:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities/15
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak


8. Usunięcie przedmiotu o id 2:
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/activities/2
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak

9. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ects": 2,
"sala": 216,
"egzamin": "nie"
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 6,
"nazwa": "Technologie komponentowe I sieciowe",
"ects": 2,
"sala": 208,
"egzamin": "tak"
}
]

10. Usunięcie wszystkich przedmiotów:
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak

11. Pobranie wszystkich przedmiotów:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak
