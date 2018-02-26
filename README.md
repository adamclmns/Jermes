# Jermes
It runs with Java! -Not totally unlike running with scissors.

## Jermes is a Task Runner
Jermes will run tasks, such as external work flows, database procs, or any type of long-running processes and see the status, historical data such as run-times, and parameters used. Tasks will be configurable, via database. 

## Why?
Sometimes there are external tasks. ETL workflows via webservice, Database Packages, JMS Messages, or anything that might be long-running, and callable in a transactional manner. Jermes will provide a user inter face to configure and execute these in a UI with easy access management. Jermes will track run times, and provide an easy API for developing integration with other systems (In house systems included).

Tasks can be passed parameters via configurable forms. 

Analytics/Stats for history of tasks will be made available via REST API.

Tasks can be configured into workflows called "marathons". Marathons will be configurable to run each work "sprint" in parallel or in sequence.

## Components
 * REST WebService interface
 * JPA Database Persistence Layer
 * Custom Implementation for new tasks to allow new tpes to be added via classpath. (Reflection scanning)
 * User Interface - SpringBoot or desktop-based User Interface (using the REST service for all logic)
 
## Testing
* Tested with JavaDB and Glassfish 4.0 as installed via Netbeans 8.2
* In Target/ directory, jax-analyzer contains swagger.json file for  generatig documentation and test suites. 
* Persistence.xml waas set to drop-and-create, but can easily be modified. 
