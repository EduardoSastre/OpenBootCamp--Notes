## JWT ( JSON Web Token )


https://jwt.io/introduction

Es un estandar abierto que permite transmitir información entre dos partes.


## Funcionamiento JWT

1. Cliente envia una petición a un servidor ( Http request POST al endpoint /api/login )
2. Servidor valida username y password, si no son validos devolvera una respuesta 401 unauthorized
3. Servidor valida username y password, si son validos genera un token JWT utilizando un secret key ( Alojada en application.properties )
4. Servidor envia el token JWT generado al cliente
5. Cuando el cliente envia peticiones a los endpoints REST del servidor, en las cabeceras de la peticion estara alojado el token JWT
6. Servidor valida el token JWT en cada petición y si es correcto permite el acceso a los datos

Ventajas:

* El token se almacena en el cliente, de manera que consume menos recursos en el servidor, lo cual permite mejor escalabilidad

Desventajas:

* El token se almacena en el cliente por lo que no se puede invalidar antes de la fecha de caducidad asignada cuando se creo
( se da la opcion de logout, esto borra el token )

## Funcionamiento Session

1. Cliente envia una petición a un servidor ( Http request POST al endpoint /api/login )
2. Servidor valida username y password, si no son validos devolvera una respuesta 401 unauthorized
3. Servidor valida username y password, si son validos se almacena el usuario en session
4. Se genera una cookie en el cliente
5. En proximas peticiones se comprueba que el cliente esta en session

Desventajas:

* La informacion de la session es almacenada en el servidor, lo cual consume mas recursos.


## Estructura JWT

1. Header

```json
{
    "alg": "HS256",
    "typ": "JWT",
}
```

2. Payload ( Informacion del usuario - No sensible )

```json
{
  "name": "John Doe",
  "admin": true
}
```

3. Signature

```
  HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
  secret)
```

Ejemplo del token generado:

```
eyJhbGci0i JIUZI1NiIsINRScCI6IkpXVCJ9.
eyJzdW1i0iIxMjMONTY30DkwLiwibmF tZSI6IkpvaG4QRG91IiwiaXNTb2NpYWwi0nRydWv9.
ApcPyMD@901PSyXnrXCjTwXyr4BsezdI1AVTmud2fU4
```

En el lado del cliente, el user-agent enviara el token en la cabecera ( De esto se encarga el front end )

```
Authorization: Bearer <token>
```


## Configuración Spring

Crear proyecto Spring Boot con:

* Spring Security
* Spring Web
* Spring Boot Devtools ( optional )
* Spring Data JPA
* PostgreSQL
* Dependencia JWT ( Se añade manualmente en el pom.xml )