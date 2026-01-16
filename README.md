# 📘 Tolerant Reader

A Spring Boot implementation of the Tolerant Reader pattern for robust REST clients.
This project makes services resilient to evolving API contracts by allowing consumers to tolerate extra or unexpected fields gracefully.

## 💡Inspiration

This implementation is directly inspired by well-known literature on API evolution and distributed systems, including Martin Fowler’s Tolerant Reader and Sam Newman’s Building Microservices (2nd Edition). The goal is to translate those ideas into a concrete, minimal, and practical Spring Boot example.

## 🧠 Why use it
Tolerant reading is intended for situations where a consumer service cannot rely on the data contract provided by an upstream service and must continue operating despite unexpected or additional fields.

This is considered an extreme measure and should not replace proper API versioning, schema contracts, or coordinated deployments. Use it only when backward compatibility cannot otherwise be guaranteed.

## 🚀 Run

Read the [Run.md](RUN.md) file to configure and run this application.

##  🔗 Links
For deeper understanding of the Tolerant Reader pattern and related design ideas:
- Martin Fowler’s Tolerant Reader article
https://martinfowler.com/bliki/TolerantReader.html
- Magnanimous Writer blog post on tolerant formats
https://tenderware.blogspot.com/2011/05/magnanimous-writer.html
- Sam Newman: Building Microservices (2nd Edition) — practical patterns and discussion around 
  resilient service interactions
  https://samnewman.io/books/building_microservices_2nd_edition/

> This file was generated with the assistance of an AI tool