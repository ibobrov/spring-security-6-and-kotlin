# security 6 & kotlin
## articles
##### GET
get articles
http://localhost:8080/api/article
## users
##### GET
get users
http://localhost:8080/api/user

##### GET
find user by uuid
http://localhost:8080/api/user/fc527774-17b9-47fc-8d55-7e307ff12ba0

##### DELETE
delete user by uuid
http://localhost:8080/api/user/fc527774-17b9-47fc-8d55-7e307ff12ba0

##### POST
create user
http://localhost:8080/api/user

```
{
    "email": "some_email@gmail.com",
    "password": "pass123"
}
```