 Consider Android Application created in Practical-10 and add Sqlite feature such that it is storing data of persons which is received in JSON Format. There should be two buttons: after pressing first button then data of persons loads from sqlite database. After pressing second button, it receives data from network database in JSON format and loads data in ListView or RecyclerView.

Create MainActivity according to below UI design.

Follow steps and Copy codes from Practical-10

Create Class DatabaseHelper for Sqlite Database

Create class to store Companion Object for Sqlite database table name, column names.

 Add some supported function in MainActivity for Sqlite database.

Add main_menu in menu folder of resource folder.

Add main_menu.xml file to toolbar of Activity as Option menu.

Add two buttons with vector icons.

Call appropriate method of mainactivity after pressing buttons of toolbar.

<img src="![1](https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/5d209d68-031a-4312-ae88-74ed1fc4c72d)
" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/e7982b0d-ae83-4013-a327-091ff8fc81a0" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/63b98fcb-67db-4169-93ea-f25a8ac599e7" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/a8138fe2-0eba-4a09-a4f7-2d7958d3e3b0" width=20% height=20%>
