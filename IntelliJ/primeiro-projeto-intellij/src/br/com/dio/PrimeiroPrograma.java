package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O Último Olimpiano",381);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));*/
    }
}
class Livro {
    private String name;
    private Integer pageNumb;

    public Livro(String name, Integer pageNumb) {
        this.name = name;
        this.pageNumb = pageNumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageNumb() {
        return pageNumb;
    }

    public void setPageNumb(Integer pageNumb) {
        this.pageNumb = pageNumb;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", pageNumb=" + pageNumb +
                '}';
    }
}