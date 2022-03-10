public class Question6 {
    public void VehicleReportCommand(String errorCode) {
        switch (errorCode) {
            case "01":
            case "04":
            case "06":
            case "07":
            case "08":
            case "11":
                reportFanBeltError();
            case "03":
            case "12":
            case "14":
            case "23":
                reportEngineCheckError();
            case "05":
            case "13":
            case "28":
            case "29":
            case "30":
                reportAirBagError();
            default:
                fixNow();
        }
    }

    public void reportFanBeltError() {
    }

    public void reportEngineCheckError() {
    }

    public void reportAirBagError() {
    }

    public void fixNow() {
    }
}
