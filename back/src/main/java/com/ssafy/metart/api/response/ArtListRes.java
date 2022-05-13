package com.ssafy.metart.api.response;

import com.ssafy.metart.db.entity.Art;
import lombok.Getter;

@Getter
public class ArtListRes {

    private Long id;
    private String name;
    private String tokenURI;
    private Boolean onSaleYn;
    private UserListRes creator;
    private UserListRes owner;

    public static ArtListRes of(Art art) {
        ArtListRes res = new ArtListRes();

        res.id = art.getId();
        res.name = art.getName();
        res.tokenURI = art.getTokenURI();
        res.onSaleYn = art.getOnSaleYn();
        res.creator = UserListRes.of(art.getCreator());
        res.owner = UserListRes.of(art.getOwner());

        return res;
    }
}