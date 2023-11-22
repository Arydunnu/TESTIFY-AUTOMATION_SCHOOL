{
	"info": {
		"_postman_id": "171e1906-73b6-4dac-bc0a-72519cb4e144",
		"name": "API Collection",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "11355708",
		"_collection_link": "https://warped-robot-374038.postman.co/workspace/Test-API~504149bb-45e0-4f4f-b963-c324c6691b6d/collection/11355708-171e1906-73b6-4dac-bc0a-72519cb4e144?action=share&source=collection_link&creator=11355708"
	},
	"item": [
		{
			"name": "Get Status",
			"event": [
				{
					"listen": "test",
					"script": {
						"exec": [
							""
						],
						"type": "text/javascript"
					}
				}
			],
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "https://simple-books-api.glitch.me/",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						""
					]
				}
			},
			"response": []
		},
		{
			"name": "Register an API Client",
			"event": [
				{
					"listen": "test",
					"script": {
						"exec": [
							""
						],
						"type": "text/javascript"
					}
				}
			],
			"request": {
				"method": "POST",
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
					"raw": "https://simple-books-api.glitch.me/api-clients/",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"api-clients",
						""
					]
				}
			},
			"response": []
		},
		{
			"name": "Get Books",
			"event": [
				{
					"listen": "test",
					"script": {
						"exec": [
							""
						],
						"type": "text/javascript"
					}
				}
			],
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "https://simple-books-api.glitch.me/books",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"books"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get a single book",
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
					"raw": "https://simple-books-api.glitch.me/books/:bookId",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"books",
						":bookId"
					],
					"query": [
						{
							"key": "",
							"value": "",
							"disabled": true
						}
					],
					"variable": [
						{
							"key": "bookId",
							"value": ""
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "Place a book order",
			"event": [
				{
					"listen": "test",
					"script": {
						"exec": [
							""
						],
						"type": "text/javascript"
					}
				}
			],
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "Token",
						"value": "03c5abfe090876ab74a2a2ac4c079174a35fd88c9b88cd2164ff4b9d56c31d6c",
						"type": "text"
					}
				],
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
					"raw": "https://simple-books-api.glitch.me/orders",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"orders"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get all orders",
			"event": [
				{
					"listen": "test",
					"script": {
						"exec": [
							""
						],
						"type": "text/javascript"
					}
				}
			],
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
					"raw": "https://simple-books-api.glitch.me/orders",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"orders"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get an order",
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
					"raw": "https://simple-books-api.glitch.me/orders/:orderId",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"orders",
						":orderId"
					],
					"variable": [
						{
							"key": "orderId",
							"value": ""
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "Update an order",
			"request": {
				"method": "PATCH",
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
					"raw": "https://simple-books-api.glitch.me/orders/:orderId/",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"orders",
						":orderId",
						""
					],
					"variable": [
						{
							"key": "orderId",
							"value": ""
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "Delete an order",
			"event": [
				{
					"listen": "test",
					"script": {
						"exec": [
							""
						],
						"type": "text/javascript"
					}
				}
			],
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
					"raw": "https://simple-books-api.glitch.me/orders/:orderId",
					"protocol": "https",
					"host": [
						"simple-books-api",
						"glitch",
						"me"
					],
					"path": [
						"orders",
						":orderId"
					],
					"variable": [
						{
							"key": "orderId",
							"value": ""
						}
					]
				}
			},
			"response": []
		}
	]
}