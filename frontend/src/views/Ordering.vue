<template>
    <div>
        <p>Checkout</p>
        <form action="">
                <legend>My information:</legend>
                <div class="leftside">
                    First name:<br>
                    <input type="text" name="firstname" value=""><br>
                    Last name:<br>
                    <input type="text" name="lastname" value=""><br>
                </div>
                <div class="rightside">
                    Email:<br>
                    <input type="text" name="email" value=""><br>
                    Tel:<br>
                    <input type="text" name="tel" value=""><br>
                </div>
                <legend>Shipping information:</legend>
                <div id="shipping-choice">
                    Shipping:<br>
                    <select id="shipping" name="shipping">
                        <option value="omniva">OMNIVA</option>
                        <option value="dpd">DPD</option>
                        <option value="itella">Itella</option>
                    </select><br>
                </div>
                <div class="leftside">
                    Maakond:<br>
                    <input type="text" name="county" value=""><br>
                    Linn:<br>
                    <input type="text" name="county" value=""><br>
                </div>
                <div class="rightside">
                    Vald:<br>
                    <input type="text" name="subregion" value=""><br>
                    Küla/alevik:<br>
                    <input type="text" name="village" value=""><br>
                </div>
                <div class="leftside">
                    Tänav:<br>
                    <input type="text" name="street" value=""><br>
                    Maja:<br>
                    <input type="text" name="house" value=""><br>
                </div>
                <div class="rightside">
                    Korter:<br>
                    <input type="text" name="flat" value=""><br>
                    Postiindeks:<br>
                    <input type="text" name="zipcode" value=""><br>
                </div>
                <div id="comments-div">
                    Comments:<br>
                    <textarea name="" id="comments" placeholder="Any comments go here"></textarea><br>
                    <!--<input type="text" name="other" value=""><br>-->
                </div>
            <input type="submit" value="ORDER">
        </form>
    </div>
</template>

<script>
    export default {
        name: "Ordering"
    }
</script>

<style scoped>
    input[type=text], select, textarea {
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        margin-top: 6px;
        margin-bottom: 14px;
        resize: vertical;
    }
    #comments {

    }
    .rightside {
        float: contour;
    }
    .leftside {
        float: left;
        margin-left: 10px;
        margin-right: 5px;
    }
    input[type=submit] {
        margin-left: 10px;
    }
    legend {
        margin-left: 10px;
    }
    #shipping-choice {
        margin-left: 10px;
    }
    #comments-div {
        margin-left: 10px;
    }
    p {
        margin-left: 10px;
    }
    html, body {
        position: relative;
        margin: 0;
        padding: 0;
        overflow: auto;
    }
</style>