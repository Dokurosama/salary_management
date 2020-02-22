package view;


public enum OptionEnum {

    REGISTER_WORKER('1',"Registrar un trabajador", "registre"),
    SHOW_WORKERS('2',"mostrar los trabajadores", "mostrar trabajadores"),
    SET_WORK('3',"asignar un trabajo", "asignar trabajo"),
    EXIT('9', "salir", "salir");
    private char charId;
    private String textOption;
    private String action;
    

    private OptionEnum(char charId, String textOption, String action) {
        this.charId = charId;
        this.textOption = textOption;
        this.action = action;
    }

    public char getCharId() {
        return charId;
    }

    public String getTextOption() {
        return textOption;
    }

    public String getAction() {
        return action;
    }

     public boolean isValidateOption(char option){
            for (OptionEnum optionEnum : OptionEnum.values()) {
                if (optionEnum.getCharId()== option) {
                    return true;
                }
            }return false;
    }
    
    

}
