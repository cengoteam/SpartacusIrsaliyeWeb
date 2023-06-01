package com.spartacus.web.business;

import com.spartacus.web.soap.*;
import com.spartacus.web.soapUtil.SoapClient;
import com.spartacus.web.soapUtil.UserTokenGenerator;
import org.springframework.stereotype.Service;

@Service
public class AdviceService {

    public String getStatus(String uuid, String documentType) {
        Integration10Soap client = SoapClient.getClient();
        String userToken = UserTokenGenerator.generateUserToken();
        ArrayOfDocumentKey docKeys = new ArrayOfDocumentKey();
        DocumentKey key = new DocumentKey();
        key.setId(uuid);
        key.setDocumentType(GetDocumentType.fromValue(documentType));
        docKeys.getDocumentKey().add(key);
        ArrayOfNDocumentWithObject res = client.getEInvoiceDocumentByObject(userToken, docKeys);
        NDocument doc = res.getNDocumentWithObject().get(0).getDocument();
        return doc.getCode() + " -> " + doc.getDetail();
    }
}
