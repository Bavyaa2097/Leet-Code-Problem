var checkIfInstanceOf = function (obj, classFunction) {
    if (obj == null || typeof classFunction !== "function") return false;

    let proto = Object.getPrototypeOf(obj);

    while (proto) {
        if (proto === classFunction.prototype) {
            return true;
        }
        proto = Object.getPrototypeOf(proto);
    }

    return false;
};
