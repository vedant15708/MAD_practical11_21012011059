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

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/e81eadad-3607-40ea-bbe6-bbbde66d0e61" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/afabafe3-4f80-41b1-a63a-51452eddf1d7" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/e102252a-f108-4f50-b23b-2a38d9b47b58" width=20% height=20%>

<img src="https://github.com/vedant15708/MAD_practical11_21012011059/assets/98215447/bedc3611-c479-4162-98ce-59d683108eaf" width=20% height=20%>
