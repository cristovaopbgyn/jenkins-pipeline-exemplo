#!/usr/bin/env groovy
pipeline {
    //Agent é o NÓ que vai rodar o job
    agent any

    //Fases do pipeline
    stages {
        stage('Build') {
            steps {
                echo 'Fazendo a build do projeto'
            }
        }
        stage('Unit Tests') {
            steps {
                echo 'Fazer testes unitários'
            }
        }
        stage('Deploy to Stage') {
            steps {
                echo 'Fazer deploy em ambiente de homologação (staging).'
            }
        }
        stage('Acceptance Tests') {
            steps {
                echo 'Fazer deploy em ambiente de homologação (staging).'
            }
        }          
    }
}
