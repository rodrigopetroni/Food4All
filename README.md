# Food4All

Uma API para o sistema de cadastro de usuário.

## Endpoints
- Cliente
    - [Cadastrar](#cadastrar-cliente)
    - Listar todas
    - Apagar
    - Alterar
    - [Mostrar os detalhes](#detalhar-cliente)

---

### Cadastrar Cliente
`POST` /clientes

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|--
| nome | decimal | sim | é o nome que o usuário irá utilizar para integrar no site
| id | int | sim | é o id do usuário (gerado automaticamente)
| email | decimal | sim | é o email que o usuário irá utilizar para integrar no site

**Exemplo de corpo do request**

```js
{
    "nome": "Rodrigo Costa Petroni",
    "email": "rodrigo.petroni@fiap.com"
}
```

**Códigos de Resposta**

| código | descrição 
|-|-
| 201 | cliente cadastrado com sucesso
| 401 | erro no cadastro do usuário

---

### Detalhar Cliente
`GET` /clientes/{id}

**Exemplo de corpo da resposta**

```js
{
  "nome": "Rodrigo Costa Petroni",
   "email": "rodrigo.petroni@fiap.com"
}
```

**Códigos de Resposta**

| código | descrição 
|-|-
| 200 | dados retornados no corpo da resposta
| 404 | não foi encontrado um cliente com os parâmetros informados
