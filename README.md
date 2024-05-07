
# Rapport

Uppgiften har varit att använda sig av ett externt bibliotek, jag gjorde valet att använda mig utav bildhanteraren Picasso. 
I projektet så implementerade jag först en ImageView i main aktivitetens layout. Sedan så implementerade jag Picasso in till build.gradle filen.
Inuti Main aktiviteten så används då picasso för att genom Image Viewen visa en bild som är hämtad genom URL.

Koden här nedanför visar hur picasso används i main activity.
URL till en bild sparas i en String för att göra allt lite mer lätt läst.
Själva imageViewn identifieras genom dess ID.
Picasso använder sedan dessa två variabler och sköter resten. 

```
String imageLink = "https://i5.walmartimages.com/seo/Nobleworks-Holy-Cow-Holy-Mackerel-Randy-McIlwaine-Humorous-Funny-Christmas-Card_60d713e0-8052-4199-9866-032437fc67cb.6a306c8ece31f61aa16b26c8d8548238.jpeg";
ImageView web = findViewById(R.id.webImage);
Picasso.get().load(imageLink).into(web);
```

<img src="Screenshot_image.png" width="300" height="600">
