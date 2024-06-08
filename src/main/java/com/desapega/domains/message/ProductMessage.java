package com.desapega.domains.message;

public class ProductMessage {

    // general exceptions
    public static final String PRODUCT_NOT_FOUND_EXCEPTION = "Nenhum produto encontrado na base de dados.";
    public static final String PRODUCT_BY_ID_NOT_FOUND_EXCEPTION = "O produto solicitado não foi encontrado. Por favor, verifique se o {id} do produto está correto.";

    public static final String PRODUCT_ALREADY_EXISTS_EXCEPTION = "Este produto já foi cadastrado. Por favor, verifique os detalhes do produto.";

    public static final String INVALID_PRODUCT_EXCEPTION = "Os dados fornecidos para o produto são inválidos ou incompletos. Por favor, revise as informações e tente novamente.";

    public static final String PRODUCT_UPDATE_FAILED_EXCEPTION = "Não foi possível atualizar as informações do produto. Por favor, tente novamente mais tarde.";

    public static final String PRODUCT_DELETION_FAILED_EXCEPTION = "Não foi possível deletar o produto. Por favor, tente novamente mais tarde.";

    public static final String INVALID_PRODUCT_STATUS_EXCEPTION = "O status fornecido para o produto é inválido. Por favor, selecione um status válido.";

    public static final String PRODUCT_STATUS_UPDATE_FAILED_EXCEPTION = "Não foi possível atualizar o status do produto. Por favor, tente novamente mais tarde.";

    public static final String PRODUCT_IMAGE_UPLOAD_FAILED_EXCEPTION = "O upload da imagem do produto falhou. Por favor, tente novamente.";

    public static final String PRODUCT_RESERVATION_FAILED_EXCEPTION = "Não foi possível reservar o produto. Por favor, tente novamente mais tarde.";

    public static final String PRODUCT_CATEGORY_NOT_FOUND_EXCEPTION = "A categoria do produto não foi encontrada. Por favor, selecione uma categoria válida";

    public static final String PRODUCT_INSUFFICIENT_PERMISSION_EXCEPTION = "Você não tem permissão para realizar esta ação no produto. Por favor, contate o administrador se precisar de ajuda.";

    public static final String PRODUCT_INACTIVE_EXCEPTION = "Esta ação não pode ser realizada em um produto inativo. Por favor, verifique o status do produto.";
}
