WEB форма регистрации и авторизации Требование к ПО: наличие установленого и запущенного docker
Установка:
Скачиваем vm_docker_ui.7z и распаковываем архив В папке с распакованным файлом вызываем команду docker load --input vm_docker_ui.tar Команда для запуска: docker run -d --name vm_docker_ui -p 5000:5000 vm_docker_ui Переходим в браузере по URl http://localhost:5000 Должна появиться страница с текстом Test home page Функционал и требования:
Возможность зарегистрировать нового пользователя Возможность войти из под учетной записи зарегистрированного пользователя По требованию, при регистрации обязательными полями являются: Email и Password, остальные поля необязательные Описание тестового задания:
Подготовить необходимый и достаточный набор тест-кейсов (в виде любого текстового файла) Подготовить набор автотестов, реализующих данные тест кейсы. Рекомендуемый язык: Java. Используемые фреймворки - любые Если были найдены баги, их описание необходимо также приложить к выполненному заданию (в виде любого текстового файла) Подготовленный набор тест-кейсов, найденных багов и автотестов необходимо выложить в ваш GitHub репозиторий и предоставить ссылку на него (Репозиторий должен быть public)
Все необходимые Тест-кейсы и Багрепорты(в двух вкладках) доступны по ссылке ниже:

Тест-кейс и баг-репорт доступны по ссылке: https://drive.google.com/drive/folders/1su8nNw_pbDf6CJdR9EZ-r4j5gxRIXBFS?usp=sharing