# user-tasks-api

## To run API
- Clone the repo
- install docker
- run docker
- Run this command to pull docker and run postgres locally
```
docker run --name=postgres-pgdb -d -p5432:5432 --restart=always -ePOSTGRES_USER=postgres -ePOSTGRES_PASSWORD=postgres -ePOSTGRES_DB=pgDB postgres:12-alpine
```
- Then, run the app using intellij

#### Note:
- postgres db-name: pgDB
- username: postgres
- password: postgres


### Postman Collection

- Json is in details section
Expand this...
<details>
  
```json
{
	"info": {
		"_postman_id": "2832b850-2889-4861-8212-3aa4bfdfed8d",
		"name": "Task-API",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "30973390"
	},
	"item": [
		{
			"name": "api-health-check",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://0.0.0.0:8080/api/health",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"health"
					]
				}
			},
			"response": []
		},
		{
			"name": "getAllTasks",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://0.0.0.0:8080/api/tasks",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"tasks"
					]
				}
			},
			"response": []
		},
		{
			"name": "getTaskById",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://0.0.0.0:8080/api/tasks/3",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"tasks",
						"3"
					]
				}
			},
			"response": []
		},
		{
			"name": "addTasks",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"heading\":\"first\",\n    \"description\":\"first-desc\",\n    \"priority\": 2,\n    \"assignedUsers\":231\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/tasks",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"tasks"
					]
				}
			},
			"response": []
		},
		{
			"name": "PUT - Update Task",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"heading\":\"task-api\",\n    \"description\":\"Task CRUD API PUT\",\n    \"priority\": 3,\n    \"assignedUsers\":3\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/tasks/5",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"tasks",
						"5"
					]
				}
			},
			"response": []
		},
		{
			"name": "PATCH - Update Task",
			"request": {
				"method": "PATCH",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"heading\":\"task-api\",\n    \"description\":\"Task CRUD API Patch\",\n    \"priority\": 3,\n    \"assignedUsers\":3\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/tasks/5",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"tasks",
						"5"
					]
				}
			},
			"response": []
		},
		{
			"name": "deleteTasks",
			"request": {
				"method": "DELETE",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"heading\":\"first\",\n    \"description\":\"first-desc\",\n    \"priority\": 2,\n    \"assignedUsers\":231\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/tasks/2",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"tasks",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "getAllUsers",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/users",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"users"
					]
				}
			},
			"response": []
		},
		{
			"name": "getUsersById",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"username\":\"Mrinal\",\n    \"role\":\"SDE3\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/users/2",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"users",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "postUsers",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"username\":\"Mrinal\",\n    \"role\":\"SDE3\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/users",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"users"
					]
				}
			},
			"response": []
		},
		{
			"name": "Put - UpdateUserByID",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n        \"username\": \"Keshav\",\n        \"role\": \"SDE\"\n    }",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/users/1",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"users",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "Patch - PartialUpdateUserByID",
			"request": {
				"method": "PATCH",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n        \"username\": \"Keshav\",\n        \"role\": \"SDE\"\n    }",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/users/1",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"users",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "DeleteUserById",
			"request": {
				"method": "DELETE",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://0.0.0.0:8080/api/users/4",
					"protocol": "http",
					"host": [
						"0",
						"0",
						"0",
						"0"
					],
					"port": "8080",
					"path": [
						"api",
						"users",
						"4"
					]
				}
			},
			"response": []
		}
	]
}
```
</details>
