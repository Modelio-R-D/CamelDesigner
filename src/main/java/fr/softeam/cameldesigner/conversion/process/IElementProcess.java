package fr.softeam.cameldesigner.conversion.process;


public interface IElementProcess<T,V> {

    T process(V element);

}
