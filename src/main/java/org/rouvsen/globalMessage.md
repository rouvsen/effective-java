If you can't run these .java files
use this command for every java file
f.e:  java -cp . Customer.java



try-with-resources : Effective java, what is advantage resources() ?
Auto Close functionality, because FileInputStream or FileOutputStream is Closable
you can path that classes to recourses section of try block
and they will close automatically (provides by try with 'resources')