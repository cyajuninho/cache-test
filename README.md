Redis Cache Project - PTBR
============================
> Projeto criado para configurar e estudar o funcionamento do Redis

O objetivo deste projeto foi implementar uma rota _/emitente/list_, onde é buscado no banco todos os registros, e guardar os dados em um cache, diminuindo radicalmente o tempo da requisição.
Também foi criado uma rota _/emitentes/clear-cache_ onde é possível limpar o cache criado na rota de lisagem


**Primeira requisição**
> Sem dados no cache
![image](https://github.com/user-attachments/assets/36df7340-3a97-48fc-868b-5183c862da93)

**Segunda requisição**
> Após ter guardado os dados em um cache
![image](https://github.com/user-attachments/assets/debbbdd3-0b39-41ad-9901-b4c565bc7525)


Redis Cache Project - EN
============================
> Project created to configure and study the functionality of Redis

The objective of this project was to implement a route _/emitente/list_, where all records are fetched from the database and stored in a cache, drastically reducing the request time. 
A route _/emitentes/clear-cache_ was also created, allowing the cache created in the listing route to be cleared.

**First Request**
> No data in the cache
![image](https://github.com/user-attachments/assets/36df7340-3a97-48fc-868b-5183c862da93)

**Second Request**
> After storing the data in a cache
![image](https://github.com/user-attachments/assets/debbbdd3-0b39-41ad-9901-b4c565bc7525)
