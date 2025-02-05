package com.busanit501.api5012.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAPIUser is a Querydsl query type for APIUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAPIUser extends EntityPathBase<APIUser> {

    private static final long serialVersionUID = -2014911242L;

    public static final QAPIUser aPIUser = new QAPIUser("aPIUser");

    public final DatePath<java.time.LocalDate> birthdate = createDate("birthdate", java.time.LocalDate.class);

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mbti = createString("mbti");

    public final StringPath mid = createString("mid");

    public final StringPath mpw = createString("mpw");

    public final StringPath name = createString("name");

    public QAPIUser(String variable) {
        super(APIUser.class, forVariable(variable));
    }

    public QAPIUser(Path<? extends APIUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAPIUser(PathMetadata metadata) {
        super(APIUser.class, metadata);
    }

}

