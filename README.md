# Lab 03 – Observer Pattern (E-commerce)

## Structure
```
src/
├── OrderObserver.java    (interface)
├── Order.java            (observable)
├── PriceObserver.java    (concrete observer)
├── QuantityObserver.java (concrete observer)
└── Main.java             (client/driver)
```

## Compiler & exécuter (terminal)
```bash
cd src
javac *.java
java Main
```

## Git workflow
```bash
# master : skeleton uniquement
git checkout master

# feature : implémentation complète
git checkout -b feature
git add .
git commit -m "feat: implement Observer pattern"
git push origin feature

# merge
git checkout master
git merge feature
git push origin master
```
