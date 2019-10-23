# MovieDetailApi

It Will provide movie name along wit description of movie but as of now we have hardcoded the description of movie **Titanic** as **Beautiful Love Story** and **Braveheart** as **Brave Story** for rest other as **Don't have description in data base**.

For Example:

http://localhost:8082/moviedetail/titanic

Responce:{"desc":"Beautiful Love Story","movieName":"Titanic"}

http://localhost:8082/moviedetail/Braveheart

Responce:{"desc":"Brave Story","movieName":"Braveheart"}

http://localhost:8082/moviedetail/AnyOtherMovie

Response:{"desc":"Don't have description in data base","movieName":"AnyOtherMovie"}
