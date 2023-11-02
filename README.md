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

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/d0f7df67-38a1-4f08-a4a7-88f41cdd9039" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/08440b41-05da-4e5e-9e23-9ba888771dc4" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/e35f2a79-7600-491f-b724-eb735c5e63d0" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/dc647dc8-963e-41c2-bd14-f0d18a535323" width=20% height=20%>
