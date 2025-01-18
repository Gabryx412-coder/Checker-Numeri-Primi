# Super Verifica Numeri e Operazioni Matematiche

Questo progetto è un'applicazione Java che fornisce un'interfaccia grafica per eseguire diverse operazioni matematiche sui numeri. Con questa applicazione, l'utente può verificare se un numero è primo, calcolare il fattoriale di un numero, trovare i suoi fattori, verificare se è perfetto o palindromo, e calcolare la somma dei numeri da 1 a N.

## Funzionalità principali

1. **Verifica se un numero è Primo**: L'applicazione verifica se un numero intero è un numero primo.
2. **Calcola i Fattori di un Numero**: L'utente può ottenere una lista di tutti i fattori di un numero dato.
3. **Calcola il Fattoriale di un Numero**: L'utente può calcolare il fattoriale di un numero (ad esempio, 5! = 5 × 4 × 3 × 2 × 1).
4. **Somma dei Numeri da 1 a N**: L'applicazione calcola la somma dei numeri da 1 fino a un numero dato (ad esempio, 1 + 2 + 3 + ... + N).
5. **Verifica se un Numero è Perfetto**: Un numero perfetto è un numero che è uguale alla somma dei suoi divisori (es. 6 è perfetto perché 1 + 2 + 3 = 6).
6. **Verifica se un Numero è Palindromo**: L'applicazione verifica se un numero è palindromo, ossia se la sua rappresentazione numerica è la stessa se letta da sinistra a destra e viceversa (es. 121).

## Come Funziona

1. **Interfaccia Grafica**:
   - L'applicazione è dotata di un'interfaccia grafica moderna e facile da usare.
   - L'utente può inserire un numero nel campo di testo e selezionare l'operazione desiderata dal menu a tendina.
   - Dopo aver selezionato l'operazione, l'utente può cliccare su "Esegui Operazione" per visualizzare il risultato.

2. **Operazioni Disponibili**:
   - L'utente può scegliere una delle seguenti operazioni:
     - Verifica se è primo.
     - Calcola i fattori di un numero.
     - Calcola il fattoriale di un numero.
     - Calcola la somma dei numeri da 1 a N.
     - Verifica se il numero è perfetto.
     - Verifica se il numero è palindromo.

3. **Caricamento e Risultati**:
   - Dopo aver premuto "Esegui Operazione", l'applicazione visualizza un indicatore di caricamento mentre esegue il calcolo.
   - Una volta completata l'operazione, il risultato verrà mostrato nell'interfaccia.

4. **Messaggi di Errore**:
   - Se l'utente inserisce un valore non valido (ad esempio, un valore non numerico), l'applicazione mostrerà un messaggio di errore chiaro e semplice.

## Requisiti

Per eseguire l'applicazione, è necessario avere:

- **Java 8** o versioni superiori installato sul tuo computer.
- Un ambiente di sviluppo come **IntelliJ IDEA** o **Eclipse** per compilare ed eseguire il programma.

## Come Eseguire l'Applicazione

### 1. Clonare o scaricare il progetto

Puoi clonare il repository usando Git:

git clone https://github.com/Gabryx412-coder/Checker-Numeri-Primi.git


Oppure scaricare il progetto come file zip e estrarlo.

### 2. Compilare ed eseguire il programma

- Apri il progetto con un IDE come **IntelliJ IDEA** o **Eclipse**.
- Compila ed esegui il programma.

### 3. Interazione con l'applicazione

- **Inserisci un numero** nel campo di testo.
- **Scegli un'operazione** dal menu a tendina.
- **Premi "Esegui Operazione"** per vedere il risultato.

## Tecnologie Utilizzate

- **Java** (versione 8 o superiore)
- **Swing** per la creazione dell'interfaccia grafica utente (GUI).
- **Threading** e **ExecutorService** per gestire l'elaborazione asincrona e migliorare l'esperienza utente.
- **JProgressBar** per visualizzare il progresso durante i calcoli.

## Esempio di Esecuzione

Supponiamo di voler verificare se il numero 7 è primo:

1. Inserisci `7` nel campo di testo.
2. Seleziona **"Verifica se è Primo"** dal menu a tendina.
3. Clicca su **"Esegui Operazione"**.
4. Il risultato mostrerà: `"7 è un numero primo."`

## Contribuire

Se vuoi contribuire al progetto, sentiti libero di fare un **fork** del repository, aggiungere funzionalità, risolvere bug e inviare una **pull request**.


---

Buon divertimento con l'applicazione! Se hai domande o suggerimenti, non esitare a creare una **pull request** o un **issue**.

