The purpose of the app to manage students, lecturers and courses. A diagram of the ER/LDM can be found in our presentation slides. The github url for this code is https://github.com/93acy/CAteam4Spring.git

1)To run the file, first connect your database via MySQL.

2)Create a scheme with the name "caps" and select the schema as the datasource.

3)First, run the app as it is. The app should automatically generate the tables in the database.

4)To populate the database, please uncomment spring.sql.init.mode=always in the application properties, and rerun the application to populate the database.

5) 	For the Admin account, the username is "admin", and password is "admin".
	
	For a lecturer account, the username is "tin", and password is "lecturer".

	For a student account, the username is "joel" and the password is "student".

Notes:

For the GPA to be reflected, a teacher needs to perform a grade function to automatically compute the calculation function in our app.

We would like to thank all our groupmates for the hardwork they have put in this project for the past 2 weeks despite all setbacks we have had. We will also like to offer our condolences to our dear groupmate Daryl whose beloved grandmother who passed on last Friday 26/6/2021.





