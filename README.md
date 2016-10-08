# karaf-feature

This project is an example how to use Karaf jdbc datasource. In this project was used H2 datasource.

This projects contains 2 Karaf features:
* jdbc-datasource
* datasource-consumer

#Prerequirements:

For developing this project it was used the followings tools:
* Apache Maven 3.3.9
* Java version: 1.8.0_101, vendor: Oracle Corporation
* IntelliJ IDEA community 2016.2
* Apache Karaf 4.0.7

#Building

In order to build this project you have to pull this repository. Then from the root folder you have to run:

```mvn clean install```

It will build and install those features in the your local maven repository.

#Installing features inside Karaf

Now is you are ready to use these features inside Karaf. This features were deployed in Karaf 

How to install and configure Karaf I'll let you to figure out. I good start can be the following URL:

https://karaf.apache.org/manual/latest/quick-start.html

Once you built them you have to login in Karaf console. Then you have add 2 repositories.
In order to add them you have to run the following commands inside Karaf console:

```repo-add mvn:com.app/jdbc-datasource/1.0-SNAPSHOT/xml/features```
```repo-add mvn:com.app/datasource-consumer/1.0-SNAPSHOT/xml/features```

Once you completed successfully the above commands you are ready to install your features in following order:

```feature:install jdbc-datasource```
```feature:install datasource-consumer```

After you installed these feature you can check if you have a DB installed on your machine. You can check with following steps:

* First we check the jndi entry:

```jndi:names```

In the output of the above commands should have the following entry:

'osgi:service/jdbc/testdb | org.h2.jdbcx.JdbcDataSource'

* Second we check it the 'customer' table was created successful by running following command line:

```jdbc:tables jdbc/testdb```
The output of the above command shoud be the list of tables of 'testdb'.

* Third we check if the insert command was successful by:
 
```jdbc:query jdbc/testdb select * from customer```

The output should be the following record:
 
 TWITTERNAME      | NAME
--------------------------------------
 @schneider_chris | Christian Schneider

Enjoy it!