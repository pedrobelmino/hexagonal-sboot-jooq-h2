/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.public_;


import br.com.pedrobelmino.springbootjooq.database.DefaultCatalog;
import br.com.pedrobelmino.springbootjooq.database.public_.tables.Author;
import br.com.pedrobelmino.springbootjooq.database.public_.tables.AuthorBook;
import br.com.pedrobelmino.springbootjooq.database.public_.tables.Book;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public final Author AUTHOR = Author.AUTHOR;

    /**
     * The table <code>PUBLIC.AUTHOR_BOOK</code>.
     */
    public final AuthorBook AUTHOR_BOOK = AuthorBook.AUTHOR_BOOK;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public final Book BOOK = Book.BOOK;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Author.AUTHOR,
            AuthorBook.AUTHOR_BOOK,
            Book.BOOK
        );
    }
}
